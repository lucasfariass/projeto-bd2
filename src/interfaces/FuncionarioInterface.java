package interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import interfaces.CRUDFuncionario.DeleteFuncionarioInterface;
import interfaces.CRUDFuncionario.InsertFuncionarioInterface;
import interfaces.CRUDFuncionario.SelectFuncionarioInterface;
import interfaces.CRUDFuncionario.UpdateFuncionarioInterface;

public class FuncionarioInterface {

    public FuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        System.out.println("Selecione a sua a��o:");
        System.out.println("1: Inserir");
        System.out.println("2: Atualizar");
        System.out.println("3: Deletar");
        System.out.println("4: Selecionar");
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
            new DeleteFuncionarioInterface(s);
            break;
        case 4:
            new SelectFuncionarioInterface(s);
            break;
        default:
            break;
        }
    }
}