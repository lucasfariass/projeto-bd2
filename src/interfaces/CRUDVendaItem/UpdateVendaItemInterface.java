package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;
import entidades.VendaItem;

public class UpdateVendaItemInterface {

    private VendaItemDAO vDao;
    private VendaItem v = new VendaItem();

    public UpdateVendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaItemDAO();
        System.out.println("Atualizar na tabela venda item\n");
        System.out.println("1 - Atualizar codigo do item\n");
        System.out.println("2 - Atualizar matricula do funcionario\n");
        System.out.println("3 - Atualizar dia, mes e ano\n");
        System.out.println("4 - Atualizar desconto\n");
        System.out.println("5 - Atualizar preço de venda e preço de compra\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            updateItemCodigo(s);
            break;
        case 2:
            updateMatriculaFuncionario(s);
            break;
        case 3:
            updateDiaMesEAno(s);
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
        System.out.println("\nDigite o novo desconto");
        v.setDesconto(s.nextDouble());

        vDao.updateDesconto(v);
    }

    private void updateDiaMesEAno(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite o dia: ");
        v.setDia(s.nextInt());
        System.out.println("\nDigite o mes: ");
        v.setMes(s.nextInt());
        System.out.println("\nDigite o ano: ");
        v.setAno(s.nextInt());

        vDao.updateDiaMesAno(v);
    }

    private void updateMatriculaFuncionario(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite a nova matricula do funcionario");
        v.setMatriculaFuncionario(s.nextInt());

        vDao.updateMatriculaFuncionario(v);
    }

    private void updateItemCodigo(Scanner s) throws SQLException {
        System.out.println("\nDigite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("\nDigite o novo codigo do item: ");
        v.setItemCodigo(s.nextInt());

        vDao.updateItemCodigo(v);
    }
}