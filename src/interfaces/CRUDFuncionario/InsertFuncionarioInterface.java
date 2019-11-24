package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import dao.FuncionarioDAO;
import entidades.Funcionario;

public class InsertFuncionarioInterface {

    private FuncionarioDAO fDao = null;
    private Funcionario f = new Funcionario();

    public InsertFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();
        System.out.println("Inserir na tabela Funcionario\n");
        System.out.println("1 - Inserir com todos os dados\n");
        System.out.println("2 - Inserir sem salario\n");
        System.out.println("3 - Inserir sem telefone\n");
        acao(s.nextInt(), s);
    }

    private void acao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            inserirFuncionario(s);
            break;
        case 2:
            inserirSemSalario(s);
            break;
        case 3:
            inserirSemTelefone(s);
            break;
        default:
            break;
        }
    }

    private void inserirSemTelefone(Scanner s) throws SQLException {
        System.out.println("\nInserir nome:");
        f.setNome(s.nextLine());
        System.out.println("\nInserir Endereço:");
        f.setEndereco(s.nextLine());
        System.out.println("\nInserir Salario:");
        f.setSalario(s.nextDouble());
        System.out.println("\nInserir Data de Nascimento:");
        f.setDataNascimento(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nInserir Data de Admissao:");
        f.setDataAdmissao(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nInserir função:");
        f.setFuncao(s.nextLine());
        System.out.println("\nInserir Data de desmissão:");
        f.setDataDemissao(LocalDateTime.parse(s.nextLine()));

        fDao.inserirFuncionario(f);
    }

    private void inserirSemSalario(Scanner s) throws SQLException {
        System.out.println("\nInserir nome:");
        f.setNome(s.nextLine());
        System.out.println("\nInserir Endereço:");
        f.setEndereco(s.nextLine());
        System.out.println("\nInserir Telefone:");
        f.setTelefone(s.nextLine());
        System.out.println("\nInserir Data de Nascimento:");
        f.setDataNascimento(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nInserir Data de Admissao:");
        f.setDataAdmissao(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nInserir função:");
        f.setFuncao(s.nextLine());
        System.out.println("\nInserir Data de desmissão:");
        f.setDataDemissao(LocalDateTime.parse(s.nextLine()));

        fDao.inserirFuncionario(f);

    }

    private void inserirFuncionario(Scanner s) throws SQLException {
        System.out.println("\nInserir nome:");
        f.setNome(s.nextLine());
        System.out.println("\nInserir Endereço:");
        f.setEndereco(s.nextLine());
        System.out.println("\nInserir Telefone:");
        f.setTelefone(s.nextLine());
        System.out.println("\nInserir Salario:");
        f.setSalario(s.nextDouble());
        System.out.println("\nInserir Data de Nascimento:");
        f.setDataNascimento(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nInserir Data de Admissao:");
        f.setDataAdmissao(LocalDateTime.parse(s.nextLine()));
        System.out.println("\nInserir função:");
        f.setFuncao(s.nextLine());
        System.out.println("\nInserir Data de desmissão:");
        f.setDataDemissao(LocalDateTime.parse(s.nextLine()));

        fDao.inserirFuncionario(f);
    }

}