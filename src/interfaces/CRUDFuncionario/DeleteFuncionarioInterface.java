package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;

public class DeleteFuncionarioInterface {

    private FuncionarioDAO fDao;
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

    public DeleteFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();
        System.out.println("Deletar da tabela funcionario");
        System.out.println("1 - Deletar pela matricula");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
        	iniciarScanners();
            System.out.println("Digite a matricula");
            fDao.deleteFuncionario(sInt.nextInt());
            break;
        default:
            break;
        }
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }
}