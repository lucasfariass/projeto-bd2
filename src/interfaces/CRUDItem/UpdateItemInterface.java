package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;
import entidades.Item;

public class UpdateItemInterface {

    private ItemDAO iDao;
    private Item i = new Item();

    public UpdateItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Atualizar na tabela item\n");
        System.out.println("1 - Atualizar preço do fornecedor\n");
        System.out.println("2 - Atualizar preço da loja\n");
        System.out.println("3 - Atualizar preço do fornecedor e da loja\n");
        System.out.println("4 - Atualizar descrição e tipo\n");
        System.out.println("5 - Atualizar preço de venda e preço de compra\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            updatePrecoFornecedor(s);
            break;
        case 2:
            updatePrecoLoja(s);
            break;
        case 3:
            updatePrecoFornecedorPrecoLoja(s);
            break;
        case 4:
            updateDescricaoETipo(s);
            break;
        default:
            break;
        }
    }

    private void updateDescricaoETipo(Scanner s) throws SQLException {
        System.out.println(("\nDigite o codigo do item:"));
        i.setCodigo(s.nextInt());
        System.out.println("\nDigite o novo tipo:");
        i.setTipo(s.nextLine());
        System.out.println("\nDigite a nova descrição:");
        i.setDescricao(s.nextLine());

        iDao.updateDescricaoTipo(i);
    }

    private void updatePrecoFornecedorPrecoLoja(Scanner s) throws SQLException {
        System.out.println(("\nDigite o codigo do item:"));
        i.setCodigo(s.nextInt());
        System.out.println("\nDigite o novo preço loja:");
        i.setPrecoLoja(s.nextDouble());
        System.out.println("\nDigite o novo preço fornecedor:");
        i.setPrecoFornecedor(s.nextDouble());

        iDao.updatePrecoFornecedorPrecoLoja(i);
    }

    private void updatePrecoLoja(Scanner s) throws SQLException {
        System.out.println(("\nDigite o codigo do item:"));
        i.setCodigo(s.nextInt());
        System.out.println("\nDigite o novo preço:");
        i.setPrecoLoja(s.nextDouble());

        iDao.updatePrecoLoja(i);
    }

    private void updatePrecoFornecedor(Scanner s) throws SQLException {
        System.out.println(("\nDigite o codigo do item:"));
        i.setCodigo(s.nextInt());
        System.out.println("\nDigite o novo preço:");
        i.setPrecoFornecedor(s.nextDouble());

        iDao.updatePrecoFornecedor(i);
    }
}