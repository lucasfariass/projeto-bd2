package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDAO;

public class DeleteAnimalInterface {
    private AnimalDAO aDao = null;
    
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

    public DeleteAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.aDao = new AnimalDAO();
        System.out.println("Deletar da tabela animal");
        System.out.println("1 - Deletar animal com o registro");
        System.out.println("2 - Deleter por tipo");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            deleteAnimal();
            break;
        case 2:
            deletePorTipo();
            break;
        default:
            break;
        }
    }

    private void deletePorTipo() throws SQLException {
        System.out.println("Digite o registro do tipo:");

        aDao.deletePorTipo(sLine.nextLine());
    }

    private void deleteAnimal() throws SQLException {
        System.out.println("Digite o registro do animal:");

        aDao.deleteAnimal(sInt.nextInt());
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }
}