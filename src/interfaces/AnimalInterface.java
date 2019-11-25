package interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import interfaces.CRUDAnimal.DeleteAnimalInterface;
import interfaces.CRUDAnimal.InsertAnimalInterface;
import interfaces.CRUDAnimal.SelectAnimalInterface;
import interfaces.CRUDAnimal.UpdateAnimalInterface;

public class AnimalInterface {

    public AnimalInterface(Scanner s) {
        System.out.println("Selecione a sua ação:");
        System.out.println("1: Inserir");
        System.out.println("2: Atualizar");
        System.out.println("3: Deletar");
        System.out.println("4: Selecionar");

        try {
            acao(s.nextInt(), s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void acao(int opcao, Scanner s) throws ClassNotFoundException, SQLException {
        switch (opcao) {
        case 1:
            new InsertAnimalInterface(s);
            break;
        case 2:
            new UpdateAnimalInterface(s);
            break;
        case 3:
            new DeleteAnimalInterface(s);
            break;
        case 4:
            new SelectAnimalInterface(s);
            break;
        default:
            break;
        }
    }
}