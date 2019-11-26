package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;
import entidades.Item;

public class InsertItemInterface {

    private ItemDAO iDao;
    private Item i = new Item();
    
    private Scanner sInt;
   	private Scanner sLine;
   	private Scanner sDouble;

    public InsertItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Inserir na tabela item");
        System.out.println("1 - Inserir com todos os dados");
        System.out.println("2 - Inserir sem validade");
        System.out.println("3 - Inserir sem preço da loja");
        opcao(s.nextInt(), s);
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            inserirItem();
            break;
        case 2:
            inserirSemValidade();
            break;
        case 3:
            inserirSemPrecoLoja();
            break;
        default:
            break;
        }
    }

    private void inserirSemPrecoLoja() throws SQLException {
        System.out.println("Digite a descrição: ");
        i.setDescricao(sLine.nextLine());
        System.out.println("Digite o tipo: ");
        i.setTipo(sLine.nextLine());
        System.out.println("Digite o preço do fornecedor: ");
        i.setPrecoFornecedor(sDouble.nextDouble());
        System.out.println("Digite a data de validade: ");
        i.setDataValidade(sLine.nextLine());
        System.out.println("Digite a quantidade de estoque:");
        i.setQtdEstoque(sInt.nextInt());

        iDao.inserirItem(i);
    }

    private void inserirSemValidade() throws SQLException {
        System.out.println("Digite a descrição: ");
        i.setDescricao(sLine.nextLine());
        System.out.println("Digite o tipo: ");
        i.setTipo(sLine.nextLine());
        System.out.println("Digite o preço do fornecedor: ");
        i.setPrecoFornecedor(sDouble.nextDouble());
        System.out.println("Digite o preço da loja: ");
        i.setPrecoLoja(sDouble.nextDouble());
        System.out.println("Digite a quantidade de estoque:");
        i.setQtdEstoque(sInt.nextInt());

        iDao.inserirSemValidade(i);
    }

    private void inserirItem() throws SQLException {
        System.out.println("Digite a descrição: ");
        i.setDescricao(sLine.nextLine());
        System.out.println("Digite o tipo: ");
        i.setTipo(sLine.nextLine());
        System.out.println("Digite o preço do fornecedor: ");
        i.setPrecoFornecedor(sDouble.nextDouble());
        System.out.println("Digite o preço da loja: ");
        i.setPrecoLoja(sDouble.nextDouble());
        System.out.println("Digite a data de validade: ");
        i.setDataValidade(sLine.nextLine());
        System.out.println("Digite a quantidade de estoque:");
        i.setQtdEstoque(sInt.nextInt());

        iDao.inserirItem(i);
    }
}