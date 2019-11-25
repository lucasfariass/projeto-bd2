package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;
import entidades.Funcionario;

public class InsertFuncionarioInterface {

    private FuncionarioDAO fDao = null;
    private Funcionario f = new Funcionario();

    public InsertFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();
        System.out.println("Inserir na tabela Funcionario");
        System.out.println("1 - Inserir com todos os dados");
        System.out.println("2 - Inserir sem salario");
        System.out.println("3 - Inserir sem telefone");
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
        System.out.println("Inserir nome:");
        f.setNome(s.nextLine());
        System.out.println("Inserir Endereço:");
        f.setEndereco(s.nextLine());
        System.out.println("Inserir Salario:");
        f.setSalario(s.nextDouble());
        System.out.println("Inserir Data de Nascimento:");
        f.setDataNascimento(s.nextLine());
        System.out.println("Inserir Data de Admissao:");
        f.setDataAdmissao(s.nextLine());
        System.out.println("Inserir função:");
        f.setFuncao(s.nextLine());

        fDao.inserirFuncionario(f);
    }

    private void inserirSemSalario(Scanner s) throws SQLException {
        System.out.println("Inserir nome:");
        f.setNome(s.nextLine());
        System.out.println("Inserir Endereço:");
        f.setEndereco(s.nextLine());
        System.out.println("Inserir Telefone:");
        f.setTelefone(s.nextLine());
        System.out.println("Inserir Data de Nascimento:");
        f.setDataNascimento(s.nextLine());
        System.out.println("Inserir Data de Admissao:");
        f.setDataAdmissao(s.nextLine());
        System.out.println("Inserir função:");
        f.setFuncao(s.nextLine());

        fDao.inserirFuncionario(f);
    }

    private void inserirFuncionario(Scanner s) throws SQLException {
        System.out.println("Inserir nome:");
        f.setNome(s.nextLine());
        System.out.println("Inserir Endereço:");
        f.setEndereco(s.nextLine());
        System.out.println("Inserir Telefone:");
        f.setTelefone(s.nextLine());
        System.out.println("Inserir Salario:");
        f.setSalario(s.nextDouble());
        System.out.println("Inserir Data de Nascimento:");
        f.setDataNascimento(s.nextLine());
        System.out.println("Inserir Data de Admissao:");
        f.setDataAdmissao(s.nextLine());
        System.out.println("Inserir função:");
        f.setFuncao(s.nextLine());

        fDao.inserirFuncionario(f);
    }

}