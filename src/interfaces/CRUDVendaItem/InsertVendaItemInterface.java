package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;
import entidades.VendaItem;

public class InsertVendaItemInterface {

    private VendaItemDAO vDao;
    private VendaItem v = new VendaItem();
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

    public InsertVendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaItemDAO();
        System.out.println("Inserir na tabela venda item");
        System.out.println("1 - Inserir com todos os dados");
        System.out.println("2 - Inserir sem desconto");
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
            inserirVendaItem();
            break;
        case 2:
            inserirSemDesconto();
            break;
        default:
            break;
        }
    }

    private void inserirSemDesconto() throws SQLException {
        System.out.println("Digite o codigo do item:");
        v.setItemCodigo(sInt.nextInt());
        System.out.println("Digite a matricula do funcionario:");
        v.setMatriculaFuncionario(sInt.nextInt());
        System.out.println("Digite o dia: ");
        v.setDia(sInt.nextInt());
        System.out.println("Digite o mes: ");
        v.setMes(sInt.nextInt());
        System.out.println("Digite o ano:");
        v.setAno(sInt.nextInt());
        System.out.println("Digite a comissao do item:");
        v.setComissaoItem(sDouble.nextDouble());
        System.out.println("Digite o valor final");
        v.setValorFinal(sDouble.nextDouble());

        vDao.inserirSemDesconto(v);
    }

    private void inserirVendaItem() throws SQLException {
        System.out.println("Digite o codigo do item:");
        v.setItemCodigo(sInt.nextInt());
        System.out.println("Digite a matricula do funcionario:");
        v.setMatriculaFuncionario(sInt.nextInt());
        System.out.println("Digite o dia: ");
        v.setDia(sInt.nextInt());
        System.out.println("Digite o mes: ");
        v.setMes(sInt.nextInt());
        System.out.println("Digite o ano:");
        v.setAno(sInt.nextInt());
        System.out.println("Digite a comissao do item:");
        v.setComissaoItem(sDouble.nextDouble());
        System.out.println("Digite o desconto:");
        v.setDesconto(sDouble.nextDouble());
        System.out.println("Digite o valor final");
        v.setValorFinal(sDouble.nextDouble());

        vDao.inserirVendaItem(v);
    }
}