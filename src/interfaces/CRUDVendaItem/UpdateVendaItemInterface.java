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
        System.out.println("Atualizar na tabela venda item");
        System.out.println("1 - Atualizar codigo do item");
        System.out.println("2 - Atualizar matricula do funcionario");
        System.out.println("3 - Atualizar dia, mes e ano");
        System.out.println("4 - Atualizar desconto");
        System.out.println("5 - Atualizar preço de venda e preço de compra");
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
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("Digite o novo desconto");
        v.setDesconto(s.nextDouble());

        vDao.updateDesconto(v);
    }

    private void updateDiaMesEAno(Scanner s) throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("Digite o dia: ");
        v.setDia(s.nextInt());
        System.out.println("Digite o mes: ");
        v.setMes(s.nextInt());
        System.out.println("Digite o ano: ");
        v.setAno(s.nextInt());

        vDao.updateDiaMesAno(v);
    }

    private void updateMatriculaFuncionario(Scanner s) throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("Digite a nova matricula do funcionario");
        v.setMatriculaFuncionario(s.nextInt());

        vDao.updateMatriculaFuncionario(v);
    }

    private void updateItemCodigo(Scanner s) throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(s.nextInt());
        System.out.println("Digite o novo codigo do item: ");
        v.setItemCodigo(s.nextInt());

        vDao.updateItemCodigo(v);
    }
}