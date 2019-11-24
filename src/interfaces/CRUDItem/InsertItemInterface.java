package interfaces.CRUDItem;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import dao.ItemDAO;
import entidades.Item;

public class InsertItemInterface {

    private ItemDAO iDao;
    private Item i = new Item();

    public InsertItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Inserir na tabela item\n");
        System.out.println("1 - Inserir com todos os dados\n");
        System.out.println("2 - Inserir sem validade\n");
        System.out.println("3 - Inserir sem preço da loja\n");
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
        System.out.println("\nDigite a descrição: ");
        i.setDescricao(s.nextLine());
        System.out.println("\nDigite o tipo: ");
        i.setTipo(s.nextLine());
        System.out.println("\nDigite o preço do fornecedor: ");
        i.setPrecoFornecedor(s.nextDouble());
        System.out.println("\nDigite a data de validade: ");
        i.setDataValidade(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nDigite a quantidade de estoque:");
        i.setQtdEstoque(s.nextInt());

        iDao.inserirItem(i);
    }

    private void inserirSemValidade(Scanner s) throws SQLException {
        System.out.println("\nDigite a descrição: ");
        i.setDescricao(s.nextLine());
        System.out.println("\nDigite o tipo: ");
        i.setTipo(s.nextLine());
        System.out.println("\nDigite o preço do fornecedor: ");
        i.setPrecoFornecedor(s.nextDouble());
        System.out.println("\nDigite o preço da loja: ");
        i.setPrecoLoja(s.nextDouble());
        System.out.println("\nDigite a quantidade de estoque:");
        i.setQtdEstoque(s.nextInt());

        iDao.inserirSemValidade(i);
    }

    private void inserirItem(Scanner s) throws SQLException {
        System.out.println("\nDigite a descrição: ");
        i.setDescricao(s.nextLine());
        System.out.println("\nDigite o tipo: ");
        i.setTipo(s.nextLine());
        System.out.println("\nDigite o preço do fornecedor: ");
        i.setPrecoFornecedor(s.nextDouble());
        System.out.println("\nDigite o preço da loja: ");
        i.setPrecoLoja(s.nextDouble());
        System.out.println("\nDigite a data de validade: ");
        i.setDataValidade(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nDigite a quantidade de estoque:");
        i.setQtdEstoque(s.nextInt());

        iDao.inserirItem(i);
    }
}