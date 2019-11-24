package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import dao.FuncionarioDAO;
import entidades.Funcionario;

public class UpdateFuncionarioInterface {

    private FuncionarioDAO fDao;
    private Funcionario f = new Funcionario();

    public UpdateFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();

        System.out.println("Atualizar na tabela funcionario\n");
        System.out.println("1 - Atualizar nome pela matricula\n");
        System.out.println("2 - Atualizar nome pelo CPF\n");
        System.out.println("3 - Atualizar endereço pela matricula\n");
        System.out.println("4 - Atualizar função pela matricula\n");
        System.out.println("5 - Atualizar data de demissão pela matricula\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            updateNomePorMatricula(s);
            break;
        case 2:
            updateNomePorCPF(s);
            break;
        case 3:
            updateEnderecoPorMatricula(s);
            break;
        case 4:
            updateFuncaoPorMatricula(s);
            break;
        case 5:
            updateDataDemissaoPorMatricula(s);
            break;
        default:
            break;
        }
    }

    private void updateDataDemissaoPorMatricula(Scanner s) throws SQLException {
        System.out.println("\nDigite a matricula:");
        f.setMatricula(s.nextInt());
        System.out.println("\nDigite a nova data de demissão:");
        f.setDataDemissao(LocalDateTime.parse(s.nextLine()));

        fDao.updateDataDemissaoPorMatricula(f);

    }

    private void updateFuncaoPorMatricula(Scanner s) throws SQLException {
        System.out.println("\nDigite a matricula:");
        f.setMatricula(s.nextInt());
        System.out.println("\nDigite a nova função");
        f.setFuncao(s.nextLine());

        fDao.updateFuncaoPorMatricula(f);
    }

    private void updateEnderecoPorMatricula(Scanner s) throws SQLException {
        System.out.println("\nDigite a matricula:");
        f.setMatricula(s.nextInt());
        System.out.println("\nDigite o novo endereço");
        f.setEndereco(s.nextLine());

        fDao.updateEnderecoPorMatricula(f);
    }

    private void updateNomePorCPF(Scanner s) throws SQLException {
        System.out.println("\nDigite a CPF:");
        f.setCpf(s.nextLine());
        System.out.println("\nDigite o novo nome:");
        f.setNome(s.nextLine());

        fDao.updateNomePorCPF(f);
    }

    private void updateNomePorMatricula(Scanner s) throws SQLException {
        System.out.println("\nDigite a matricula:");
        f.setMatricula(s.nextInt());
        System.out.println("\nDigite o nome:");
        f.setNome(s.nextLine());

        fDao.updateNomePorMatricula(f);
    }
}