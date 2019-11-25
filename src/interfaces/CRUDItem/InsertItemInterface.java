package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;
import entidades.Item;

public class InsertItemInterface {

    private ItemDAO iDao;
    private Item i = new Item();

    public InsertItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Inserir na tabela item");
        System.out.println("1 - Inserir com todos os dados");
        System.out.println("2 - Inserir sem validade");
        System.out.println("3 - Inserir sem preço da loja");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            inserirItem(s);
            break;
        case 2:
            inserirSemValidade(s);
            break;
        case 3:
            inserirSemPrecoLoja(s);
            break;
        default:
            break;
        }
    }

    private void inserirSemPrecoLoja(Scanner s) throws SQLException {
        System.out.println("Digite a descrição: ");
        i.setDescricao(s.nextLine());
        System.out.println("Digite o tipo: ");
        i.setTipo(s.nextLine());
        System.out.println("Digite o preço do fornecedor: ");
        i.setPrecoFornecedor(s.nextDouble());
        System.out.println("Digite a data de validade: ");
        i.setDataValidade(s.nextLine());
        System.out.println("Digite a quantidade de estoque:");
        i.setQtdEstoque(s.nextInt());

        iDao.inserirItem(i);
    }

    private void inserirSemValidade(Scanner s) throws SQLException {
        System.out.println("Digite a descrição: ");
        i.setDescricao(s.nextLine());
        System.out.println("Digite o tipo: ");
        i.setTipo(s.nextLine());
        System.out.println("Digite o preço do fornecedor: ");
        i.setPrecoFornecedor(s.nextDouble());
        System.out.println("Digite o preço da loja: ");
        i.setPrecoLoja(s.nextDouble());
        System.out.println("Digite a quantidade de estoque:");
        i.setQtdEstoque(s.nextInt());

        iDao.inserirSemValidade(i);
    }

    private void inserirItem(Scanner s) throws SQLException {
        System.out.println("Digite a descrição: ");
        i.setDescricao(s.nextLine());
        System.out.println("Digite o tipo: ");
        i.setTipo(s.nextLine());
        System.out.println("Digite o preço do fornecedor: ");
        i.setPrecoFornecedor(s.nextDouble());
        System.out.println("Digite o preço da loja: ");
        i.setPrecoLoja(s.nextDouble());
        System.out.println("Digite a data de validade: ");
        i.setDataValidade(s.nextLine());
        System.out.println("Digite a quantidade de estoque:");
        i.setQtdEstoque(s.nextInt());

        iDao.inserirItem(i);
    }
}