package interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import interfaces.CRUDVendaItem.DeleteVendaItemInterface;
import interfaces.CRUDVendaItem.InsertVendaItemInterface;
import interfaces.CRUDVendaItem.SelectVendaItemInterface;
import interfaces.CRUDVendaItem.UpdateVendaItemInterface;

public class VendaItemInterface {

    public VendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        System.out.println("Selecione a sua ação:\n");
        System.out.println("1: Inserir\n");
        System.out.println("2: Atualizar\n");
        System.out.println("3: Deletar\n");
        System.out.println("4: Selecionar\n");
        acao(s.nextInt(), s);
    }

    private void acao(int nextInt, Scanner s) throws ClassNotFoundException, SQLException {
        switch (nextInt) {
        case 1:
            new InsertVendaItemInterface(s);
            break;
        case 2:
            new UpdateVendaItemInterface(s);
            break;
        case 3:
            new DeleteVendaItemInterface(s);
            break;
        case 4:
            new SelectVendaItemInterface(s);
            break;
        default:
            break;
        }
    }
}