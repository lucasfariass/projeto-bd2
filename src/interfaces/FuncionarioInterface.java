package interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import interfaces.CRUDFuncionario.InsertFuncionarioInterface;
import interfaces.CRUDFuncionario.UpdateFuncionarioInterface;

public class FuncionarioInterface {

    public FuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        System.out.println("Selecione a sua ação:\n");
        System.out.println("1: Inserir\n");
        System.out.println("2: Atualizar\n");
        System.out.println("3: Deletar\n");
        System.out.println("4: Selecionar\n");
        acao(s.nextInt(), s);
    }

    private void acao(int opcao, Scanner s) throws ClassNotFoundException, SQLException {
        switch (opcao) {
        case 1:
            new InsertFuncionarioInterface(s);
            break;
        case 2:
            new UpdateFuncionarioInterface(s);
            break;
        case 3:
            break;
        case 4:
            break;
        default:
            break;
        }
    }
}