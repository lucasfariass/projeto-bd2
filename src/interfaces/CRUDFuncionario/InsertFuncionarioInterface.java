package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;
import entidades.Funcionario;

public class InsertFuncionarioInterface {

    private FuncionarioDAO fDao = null;
    private Funcionario f = new Funcionario();
	private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

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
            inserirFuncionario();
            break;
        case 2:
            inserirSemSalario();
            break;
        case 3:
            inserirSemTelefone();
            break;
        default:
            break;
        }
    }

    private void inserirSemTelefone() throws SQLException {
    	iniciarScanners();
    
        System.out.println("Inserir nome:");
        f.setNome(sLine.nextLine());
        System.out.println("Inserir CPF:");
        f.setCpf(sLine.nextLine());
        System.out.println("Inserir Endereço:");
        f.setEndereco(sLine.nextLine());
        System.out.println("Inserir Salario:");
        f.setSalario(sDouble.nextDouble());
        System.out.println("Inserir Data de Nascimento:");
        f.setDataNascimento(sLine.nextLine());
        System.out.println("Inserir Data de Admissao:");
        f.setDataAdmissao(sLine.nextLine());
        System.out.println("Inserir função:");
        f.setFuncao(sLine.nextLine());

        fDao.inserirSemTelefone(f);
    }

    private void inserirSemSalario() throws SQLException {
    	iniciarScanners();
    	
        System.out.println("Inserir Nome:");
        f.setNome(sLine.nextLine());
        System.out.println("Inserir CPF:");
        f.setCpf(sLine.nextLine());
        System.out.println("Inserir Endereço:");
        f.setEndereco(sLine.nextLine());
        System.out.println("Inserir Telefone:");
        f.setTelefone(sLine.nextLine());
        System.out.println("Inserir Data de Nascimento:");
        f.setDataNascimento(sLine.nextLine());
        System.out.println("Inserir Data de Admissao:");
        f.setDataAdmissao(sLine.nextLine());
        System.out.println("Inserir função:");
        f.setFuncao(sLine.nextLine());

        fDao.inserirSemSalario(f);
    }

    private void inserirFuncionario() throws SQLException {
    	iniciarScanners();
    	
        System.out.println("Inserir nome:");
        f.setNome(sLine.nextLine());
        System.out.println("Inserir CPF:");
        f.setCpf(sLine.nextLine());
        System.out.println("Inserir Endereço:");
        f.setEndereco(sLine.nextLine());
        System.out.println("Inserir Telefone:");
        f.setTelefone(sLine.nextLine());
        System.out.println("Inserir Salario:");
        f.setSalario(sDouble.nextDouble());
        System.out.println("Inserir Data de Nascimento:");
        f.setDataNascimento(sLine.nextLine());
        System.out.println("Inserir Data de Admissao:");
        f.setDataAdmissao(sLine.nextLine());
        System.out.println("Inserir função:");
        f.setFuncao(sLine.nextLine());

        fDao.inserirFuncionario(f);
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }

}