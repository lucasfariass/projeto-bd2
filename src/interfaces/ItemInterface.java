package interfaces;

import java.util.Scanner;

public class ItemInterface {

    public ItemInterface(Scanner s) {
        System.out.println("Selecione a sua ação:\n");
        System.out.println("1: Inserir\n");
        System.out.println("2: Atualizar\n");
        System.out.println("3: Deletar\n");
        System.out.println("4: Selecionar\n");
        acao(s.nextInt(), s);

    }

    private void acao(int nextInt, Scanner s) {
        switch (nextInt) {
        case 1:
            new ItemInterface(s);
            break;

        default:
            break;
        }
    }
}