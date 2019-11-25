package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;

public class DeleteItemInterface {

    private ItemDAO iDao;

    public DeleteItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Deletar da tabela item");
        System.out.println("1 - Deletar animal com o registro");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            System.out.println("Digite o codigo:");
            iDao.deleteItem(s.nextInt());
            break;
        default:
            break;
        }
    }
}