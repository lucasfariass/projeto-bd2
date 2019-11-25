package interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import interfaces.CRUDVendaAnimal.DeleteVendaAnimalInterface;
import interfaces.CRUDVendaAnimal.InsertVendaAnimalInterface;
import interfaces.CRUDVendaAnimal.SelectVendaAnimalInterface;
import interfaces.CRUDVendaAnimal.UpdateVendaAnimal;

public class VendaAnimalInterface {

    public VendaAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        System.out.println("Selecione a sua ação:");
        System.out.println("1: Inserir");
        System.out.println("2: Atualizar");
        System.out.println("3: Deletar");
        System.out.println("4: Selecionar");
        acao(s.nextInt(), s);
    }

    private void acao(int nextInt, Scanner s) throws ClassNotFoundException, SQLException {
        switch (nextInt) {
        case 1:
            new InsertVendaAnimalInterface(s);
            break;
        case 2:
            new UpdateVendaAnimal(s);
            break;
        case 3:
            new DeleteVendaAnimalInterface(s);
            break;
        case 4:
            new SelectVendaAnimalInterface(s);
            break;
        default:
            break;
        }
    }
}