package interfaces.CRUDVendaAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaAnimalDAO;
import entidades.VendaAnimal;

public class UpdateVendaAnimal {

    private VendaAnimalDAO vDao;
    private VendaAnimal v = new VendaAnimal();

    public UpdateVendaAnimal(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaAnimalDAO();
        System.out.println("Atualizar na tabela venda animal\n");
        System.out.println("1 - Atualizar registro animal\n");
        System.out.println("2 - Atualizar matricula funcionario\n");
        System.out.println("3 - Atualizar dia, mes e ano\n");
        System.out.println("4 - Atualizar desconto\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            updateRegistroAnimal(s);
            break;
        case 2:
            updateMatriculaFuncionario(s);
            break;
        case 3:
            updateDiaMesAno(s);
            break;
        case 4:
            updateDesconto(s);
            break;
        default:
            break;
        }
    }

    private void updateDesconto(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite o novo desconto: ");
        v.setDesconto(s.nextDouble());
        
        vDao.updateDesconto(v);
    }

    private void updateDiaMesAno(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite o novo dia: ");
        v.setDia(s.nextInt());
        System.out.println("\nDigite o novo mes: ");
        v.setMes(s.nextInt());
        System.out.println("\nDigite o novo ano: ");
        v.setAno(s.nextInt());

        vDao.updateDiaMesAno(v);
    }

    private void updateMatriculaFuncionario(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite a nova matricula: ");
        v.setMatriculaFuncionario(s.nextInt());

        vDao.updateMatriculaFuncionario(v);
    }

    private void updateRegistroAnimal(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite o novo registro: ");
        v.setRegistroAnimal(s.nextInt());

        vDao.updateRegistroAnimal(v);
    }
}