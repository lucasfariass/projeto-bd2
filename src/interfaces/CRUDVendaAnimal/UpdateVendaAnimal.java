package interfaces.CRUDVendaAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaAnimalDAO;
import entidades.VendaAnimal;

public class UpdateVendaAnimal {

    private VendaAnimalDAO vDao;
    private VendaAnimal v = new VendaAnimal();
    
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

    public UpdateVendaAnimal(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaAnimalDAO();
        System.out.println("Atualizar na tabela venda animal");
        System.out.println("1 - Atualizar registro animal");
        System.out.println("2 - Atualizar matricula funcionario");
        System.out.println("3 - Atualizar dia, mes e ano");
        System.out.println("4 - Atualizar desconto");
        opcao(s.nextInt(), s);
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            updateRegistroAnimal();
            break;
        case 2:
            updateMatriculaFuncionario();
            break;
        case 3:
            updateDiaMesAno();
            break;
        case 4:
            updateDesconto();
            break;
        default:
            break;
        }
    }

    private void updateDesconto() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite o novo desconto: ");
        v.setDesconto(sDouble.nextDouble());

        vDao.updateDesconto(v);
    }

    private void updateDiaMesAno() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite o novo dia: ");
        v.setDia(sInt.nextInt());
        System.out.println("Digite o novo mes: ");
        v.setMes(sInt.nextInt());
        System.out.println("Digite o novo ano: ");
        v.setAno(sInt.nextInt());

        vDao.updateDiaMesAno(v);
    }

    private void updateMatriculaFuncionario() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite a nova matricula: ");
        v.setMatriculaFuncionario(sInt.nextInt());

        vDao.updateMatriculaFuncionario(v);
    }

    private void updateRegistroAnimal() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite o novo registro: ");
        v.setRegistroAnimal(sInt.nextInt());

        vDao.updateRegistroAnimal(v);
    }
}