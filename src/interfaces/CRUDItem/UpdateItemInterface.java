package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;
import entidades.Item;

public class UpdateItemInterface {

    private ItemDAO iDao;
    private Item i = new Item();
    
    private Scanner sInt;
   	private Scanner sLine;
   	private Scanner sDouble;

    public UpdateItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Atualizar na tabela item");
        System.out.println("1 - Atualizar preço do fornecedor");
        System.out.println("2 - Atualizar preço da loja");
        System.out.println("3 - Atualizar preço do fornecedor e da loja");
        System.out.println("4 - Atualizar descrição e tipo");
        System.out.println("5 - Atualizar preço de venda e preço de compra");
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
            updatePrecoFornecedor();
            break;
        case 2:
            updatePrecoLoja();
            break;
        case 3:
            updatePrecoFornecedorPrecoLoja();
            break;
        case 4:
            updateDescricaoETipo();
            break;
        default:
            break;
        }
    }

    private void updateDescricaoETipo() throws SQLException {
        System.out.println(("Digite o codigo do item:"));
        i.setCodigo(sInt.nextInt());
        System.out.println("Digite o novo tipo:");
        i.setTipo(sLine.nextLine());
        System.out.println("Digite a nova descrição:");
        i.setDescricao(sLine.nextLine());

        iDao.updateDescricaoTipo(i);
    }

    private void updatePrecoFornecedorPrecoLoja() throws SQLException {
        System.out.println(("Digite o codigo do item:"));
        i.setCodigo(sInt.nextInt());
        System.out.println("Digite o novo preço loja:");
        i.setPrecoLoja(sDouble.nextDouble());
        System.out.println("Digite o novo preço fornecedor:");
        i.setPrecoFornecedor(sDouble.nextDouble());

        iDao.updatePrecoFornecedorPrecoLoja(i);
    }

    private void updatePrecoLoja() throws SQLException {
        System.out.println(("Digite o codigo do item:"));
        i.setCodigo(sInt.nextInt());
        System.out.println("Digite o novo preço:");
        i.setPrecoLoja(sDouble.nextDouble());

        iDao.updatePrecoLoja(i);
    }

    private void updatePrecoFornecedor() throws SQLException {
        System.out.println(("Digite o codigo do item:"));
        i.setCodigo(sInt.nextInt());
        System.out.println("Digite o novo preço:");
        i.setPrecoFornecedor(sDouble.nextDouble());

        iDao.updatePrecoFornecedor(i);
    }
}