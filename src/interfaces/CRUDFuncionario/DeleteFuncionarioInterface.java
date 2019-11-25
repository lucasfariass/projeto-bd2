package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;

public class DeleteFuncionarioInterface {

    private FuncionarioDAO fDao;

    public DeleteFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();
        System.out.println("Deletar da tabela funcionario");
        System.out.println("1 - Deletar pela matricula");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            System.out.println("Digite a matricula");
            fDao.deleteFuncionario(s.nextInt());
            break;
        default:
            break;
        }
    }
}