package interfaces.CRUDVendaAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaAnimalDAO;

public class DeleteVendaAnimalInterface {

    private VendaAnimalDAO vDao;

    public DeleteVendaAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaAnimalDAO();
        System.out.println("Deletar da tabela venda Animal");
        System.out.println("1 - Deletar venda animal com a nota fiscal");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            System.out.println("Digite a nota fiscal: ");
            vDao.deleteVendaAnimal(s.nextInt());
            break;
        default:
            break;
        }
    }
}