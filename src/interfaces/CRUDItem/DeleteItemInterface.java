package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;

public class DeleteItemInterface {

    private ItemDAO iDao;
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

    public DeleteItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Deletar da tabela item");
        System.out.println("1 - Deletar animal com o registro");
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
            System.out.println("Digite o codigo:");
            iDao.deleteItem(sInt.nextInt());
            break;
        default:
            break;
        }
    }
}