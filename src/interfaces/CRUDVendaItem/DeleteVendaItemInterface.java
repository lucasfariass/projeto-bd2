package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;

public class DeleteVendaItemInterface {

    private VendaItemDAO vDao;
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

    public DeleteVendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaItemDAO();
        System.out.println("Deletar da tabela venda item");
        System.out.println("1 - Deletar pela nota fiscal");
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
            System.out.println("Digite a nota fiscal: ");
            vDao.deleteVendaItem(sInt.nextInt());
            break;
        default:
            break;
        }
    }
}