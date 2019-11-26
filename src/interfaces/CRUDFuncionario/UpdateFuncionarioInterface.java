package interfaces.CRUDFuncionario;

import java.sql.SQLException;
import java.util.Scanner;

import dao.FuncionarioDAO;
import entidades.Funcionario;

public class UpdateFuncionarioInterface {

    private FuncionarioDAO fDao;
    private Funcionario f = new Funcionario();
    private Scanner sInt;
   	private Scanner sLine;
   	private Scanner sDouble;

    public UpdateFuncionarioInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.fDao = new FuncionarioDAO();

        System.out.println("Atualizar na tabela funcionario");
        System.out.println("1 - Atualizar nome pela matricula");
        System.out.println("2 - Atualizar nome pelo CPF");
        System.out.println("3 - Atualizar endereço pela matricula");
        System.out.println("4 - Atualizar função pela matricula");
        System.out.println("5 - Atualizar data de demissão pela matricula");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            updateNomePorMatricula();
            break;
        case 2:
            updateNomePorCPF();
            break;
        case 3:
            updateEnderecoPorMatricula();
            break;
        case 4:
            updateFuncaoPorMatricula();
            break;
        case 5:
            updateDataDemissaoPorMatricula();
            break;
        default:
            break;
        }
    }

    private void updateDataDemissaoPorMatricula() throws SQLException {
        System.out.println("Digite a matricula:");
        f.setMatricula(sInt.nextInt());
        System.out.println("Digite a nova data de demissão:");
        f.setDataDemissao(sLine.nextLine());

        fDao.updateDataDemissaoPorMatricula(f);

    }

    private void updateFuncaoPorMatricula() throws SQLException {
        System.out.println("Digite a matricula:");
        f.setMatricula(sInt.nextInt());
        System.out.println("Digite a nova função");
        f.setFuncao(sLine.nextLine());

        fDao.updateFuncaoPorMatricula(f);
    }

    private void updateEnderecoPorMatricula() throws SQLException {
        System.out.println("Digite a matricula:");
        f.setMatricula(sInt.nextInt());
        System.out.println("Digite o novo endereço");
        f.setEndereco(sLine.nextLine());

        fDao.updateEnderecoPorMatricula(f);
    }

    private void updateNomePorCPF() throws SQLException {
        System.out.println("Digite a CPF:");
        f.setCpf(sLine.nextLine());
        System.out.println("Digite o novo nome:");
        f.setNome(sLine.nextLine());

        fDao.updateNomePorCPF(f);
    }

    private void updateNomePorMatricula() throws SQLException {
        System.out.println("Digite a matricula:");
        f.setMatricula(sInt.nextInt());
        System.out.println("Digite o nome:");
        f.setNome(sLine.nextLine());

        fDao.updateNomePorMatricula(f);
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }
}