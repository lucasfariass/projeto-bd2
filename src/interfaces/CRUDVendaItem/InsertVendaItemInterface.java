package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;
import entidades.VendaItem;

public class InsertVendaItemInterface {

    private VendaItemDAO vDao;
    private VendaItem v = new VendaItem();

    public InsertVendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaItemDAO();
        System.out.println("Inserir na tabela venda item\n");
        System.out.println("1 - Inserir com todos os dados\n");
        System.out.println("2 - Inserir sem desconto\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            inserirVendaItem(s);
            break;
        case 2:
            inserirSemDesconto(s);
            break;
        default:
            break;
        }
    }

    private void inserirSemDesconto(Scanner s) throws SQLException {
        System.out.println("\nDigite o codigo do item:");
        v.setItemCodigo(s.nextInt());
        System.out.println("\nDigite a matricula do funcionario:");
        v.setMatriculaFuncionario(s.nextInt());
        System.out.println("\nDigite o dia: ");
        v.setDia(s.nextInt());
        System.out.println("\nDigite o mes: ");
        v.setMes(s.nextInt());
        System.out.println("\nDigite o ano:");
        v.setAno(s.nextInt());
        System.out.println("\nDigite a comissao do item:");
        v.setComissaoItem(s.nextDouble());
        System.out.println("\nDigite o valor final");
        v.setValorFinal(s.nextDouble());

        vDao.inserirSemDesconto(v);
    }

    private void inserirVendaItem(Scanner s) throws SQLException {
        System.out.println("\nDigite o codigo do item:");
        v.setItemCodigo(s.nextInt());
        System.out.println("\nDigite a matricula do funcionario:");
        v.setMatriculaFuncionario(s.nextInt());
        System.out.println("\nDigite o dia: ");
        v.setDia(s.nextInt());
        System.out.println("\nDigite o mes: ");
        v.setMes(s.nextInt());
        System.out.println("\nDigite o ano:");
        v.setAno(s.nextInt());
        System.out.println("\nDigite a comissao do item:");
        v.setComissaoItem(s.nextDouble());
        System.out.println("\nDigite o desconto:");
        v.setDesconto(s.nextDouble());
        System.out.println("\nDigite o valor final");
        v.setValorFinal(s.nextDouble());

        vDao.inserirVendaItem(v);
    }
}