package interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import interfaces.CRUDItem.DeleteItemInterface;
import interfaces.CRUDItem.InsertItemInterface;
import interfaces.CRUDItem.SelectItemInterface;
import interfaces.CRUDItem.UpdateItemInterface;

public class ItemInterface {

    public ItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
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
            new InsertItemInterface(s);
            break;
        case 2:
            new UpdateItemInterface(s);
            break;
        case 3:
            new DeleteItemInterface(s);
            break;
        case 4:
            new SelectItemInterface(s);
            break;
        default:
            break;
        }
    }
}