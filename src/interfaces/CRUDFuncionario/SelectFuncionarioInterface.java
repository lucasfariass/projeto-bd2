package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;

public class SelectFuncionarioInterface {

    private FuncionarioDAO fDao;

    public SelectFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();
        System.out.println("Selecionar na tabela animal\n");
        System.out.println("1 - Selecionar tudo\n");
        System.out.println("2 - Selecionar pela descrição\n");
        System.out.println("3 - Selecionar dados pelo mes e ano\n");
        System.out.println("4 - Selecionar salario pelo mes e ano c\n");
        opcao(s.nextInt(), s);

    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            fDao.selectAll();
            break;
        case 2:
            System.out.println("\nDigite o nome:");
            fDao.selectByNome(s.nextLine());
            break;
        case 3:
            selectDadosByMeseAno(s);
            break;
        case 4:
            selectDadosByMeseAnoSalario(s);
            break;
        default:
            break;
        }
    }

    private void selectDadosByMeseAno(Scanner s) throws SQLException {
        String mes, ano;
        System.out.println("\nDigite o mes:");
        mes = s.nextLine();
        System.out.println("\nDigite o ano:");
        ano = s.nextLine();

        fDao.selectDadosByMeseAno(mes, ano);
    }

    private void selectDadosByMeseAnoSalario(Scanner s) throws SQLException {
        String mes, ano;
        System.out.println("\nDigite o mes:");
        mes = s.nextLine();
        System.out.println("\nDigite o ano:");
        ano = s.nextLine();

        fDao.selectDadosByMeseAnoSalario(mes, ano);
    }
}