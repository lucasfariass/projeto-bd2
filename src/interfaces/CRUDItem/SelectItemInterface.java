package interfaces.CRUDItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ItemDAO;

public class SelectItemInterface {

    private ItemDAO iDao;

    public SelectItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.iDao = new ItemDAO();
        System.out.println("Selecionar da tabela item\n");
        System.out.println("1 - Selecionar tudo\n");
        System.out.println("2 - Selecionar pela descrição\n");
        System.out.println("3 - Selecionar por tipo\n");
        System.out.println("4 - Selecionar totalização\n");
        System.out.println("5 - Selecionar lucro\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            iDao.selectAll();
            break;
        case 2:
            System.out.println("\nDigite a descrição");
            iDao.selectByDescricao(s.nextLine());
        case 3:
            System.out.println("\nDigite o tipo:");
            iDao.selectByTipo(s.nextLine());
        case 4:
            iDao.selectTotalizacao();
        case 5:
            iDao.selectLucro();
        default:
            break;
        }
    }

}