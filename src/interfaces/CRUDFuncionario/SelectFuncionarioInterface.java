package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;

public class SelectFuncionarioInterface {

    private FuncionarioDAO fDao;
    private Scanner sInt;
   	private Scanner sLine;
   	private Scanner sDouble;

    public SelectFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();
        System.out.println("Selecionar na tabela funcionario");
        System.out.println("1 - Selecionar tudo");
        System.out.println("2 - Selecionar pela descrição");
        System.out.println("3 - Selecionar dados pelo mes e ano");
        System.out.println("4 - Selecionar salario pelo mes e ano c");
        opcao(s.nextInt(), s);

    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            fDao.selectAll();
            break;
        case 2:
            System.out.println("Digite o nome:");
            fDao.selectByNome(sLine.nextLine());
            break;
        case 3:
            selectDadosByMeseAno();
            break;
        case 4:
            selectDadosByMeseAnoSalario();
            break;
        default:
            break;
        }
    }

    private void selectDadosByMeseAno() throws SQLException {
        String mes, ano;
        System.out.println("Digite o mes:");
        mes = sLine.nextLine();
        System.out.println("Digite o ano:");
        ano = sLine.nextLine();

        fDao.selectDadosByMeseAno(mes, ano);
    }

    private void selectDadosByMeseAnoSalario() throws SQLException {
        String mes, ano;
        System.out.println("Digite o mes:");
        mes = sLine.nextLine();
        System.out.println("Digite o ano:");
        ano = sLine.nextLine();

        fDao.selectDadosByMeseAnoSalario(mes, ano);
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }
}