package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;

public class DeleteItemInterface {

    private ItemDAO iDao;

    public DeleteItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Deletar da tabela item\n");
        System.out.println("1 - Deletar animal com o registro\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            System.out.println("\nDigite o codigo:");
            iDao.deleteItem(s.nextLine());
            break;
        default:
            break;
        }
    }
}