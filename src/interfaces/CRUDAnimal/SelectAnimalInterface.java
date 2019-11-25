package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDAO;

public class SelectAnimalInterface {
    private AnimalDAO aDao = null;

    public SelectAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.aDao = new AnimalDAO();
        System.out.println("Selecionar da tabela animal");
        System.out.println("1 - Selecionar tudo");
        System.out.println("2 - Selecionar por tipo");
        System.out.println("3 - Selecionar por preço de venda");
        System.out.println("4 - Selecionar totalização");
        System.out.println("5 - Selecionar lucro");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            aDao.selectAll();
            break;

        case 2:
            selectPorTipo(s);
            break;

        case 3:
            selectPorPrecoDeVenda(s);
            break;

        case 4:
            aDao.selectTotalizacao();
            break;

        case 5:
            aDao.selectLucro();
            break;
        default:
            break;
        }
    }

    private void selectPorPrecoDeVenda(Scanner s) {
        System.out.println("Digite o preço de venda: ");

        try {
            aDao.selectPorPrecoDeVenda(s.nextDouble());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void selectPorTipo(Scanner s) {
        System.out.println(" Digite o tipo: ");

        try {
            aDao.selectPorTipo(s.nextLine());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}