package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;
import entidades.VendaItem;

public class UpdateVendaItemInterface {

    private VendaItemDAO vDao;
    private VendaItem v = new VendaItem();
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;

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
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }
    

    private void opcao(int nextInt, Scanner s) throws SQLException {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            updateItemCodigo();
            break;
        case 2:
            updateMatriculaFuncionario();
            break;
        case 3:
            updateDiaMesEAno();
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
        System.out.println("Digite o novo desconto");
        v.setDesconto(sDouble.nextDouble());

        vDao.updateDesconto(v);
    }

    private void updateDiaMesEAno() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite o dia: ");
        v.setDia(sInt.nextInt());
        System.out.println("Digite o mes: ");
        v.setMes(sInt.nextInt());
        System.out.println("Digite o ano: ");
        v.setAno(sInt.nextInt());

        vDao.updateDiaMesAno(v);
    }

    private void updateMatriculaFuncionario() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite a nova matricula do funcionario");
        v.setMatriculaFuncionario(sInt.nextInt());

        vDao.updateMatriculaFuncionario(v);
    }

    private void updateItemCodigo() throws SQLException {
        System.out.println("Digite a nota fiscal: ");
        v.setNotaFiscal(sInt.nextInt());
        System.out.println("Digite o novo codigo do item: ");
        v.setItemCodigo(sInt.nextInt());

        vDao.updateItemCodigo(v);
    }
}