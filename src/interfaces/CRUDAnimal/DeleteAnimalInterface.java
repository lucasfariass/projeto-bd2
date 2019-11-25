package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDAO;

public class DeleteAnimalInterface {
    private AnimalDAO aDao = null;

    public DeleteAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.aDao = new AnimalDAO();
        System.out.println("Deletar da tabela animal");
        System.out.println("1 - Deletar animal com o registro");
        System.out.println("2 - Deleter por tipo");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            deleteAnimal(s);
            break;
        case 2:
            deletePorTipo(s);
            break;
        default:
            break;
        }
    }

    private void deletePorTipo(Scanner s) throws SQLException {
        System.out.println("Digite o registro do tipo:");

        aDao.deletePorTipo(s.nextLine());
    }

    private void deleteAnimal(Scanner s) throws SQLException {
        System.out.println("Digite o registro do animal:");

        aDao.deleteAnimal(s.nextInt());
    }
}