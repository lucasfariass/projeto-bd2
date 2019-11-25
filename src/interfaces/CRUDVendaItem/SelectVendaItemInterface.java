package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;

public class SelectVendaItemInterface {

    private VendaItemDAO vDao;

    public SelectVendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaItemDAO();
        System.out.println("Selecionar da tabela venda item\n");
        System.out.println("1 - Selecionar tudo\n");
        System.out.println("2 - Selecionar pela descrição\n");
        System.out.println("3 - Selecionar pelo nome do vendedor\n");
        System.out.println("4 - Selecionar pelo mes e ano e descrição\n");
        System.out.println("5 - Selecionar matricula e codigo\n");
        System.out.println("6 - Selecionar totalização e quantidade\n");
        System.out.println("7 - Selecionar totalização e quantidade pelo mes e ano\n");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            vDao.selectAll();
            break;
        case 2:
            System.out.println("\nDigite a descrição: ");
            vDao.selectByDescricao(s.nextLine());
            break;
        case 3:
            System.out.println("\nDigite o nome: ");
            vDao.selectByNomeVendedor(s.nextLine());
            break;
        case 4:
            selectByDescricaoMesAno(s);
            break;
        case 5:
            vDao.selectMatriculaCodigoEVendas();
            break;
        case 6:
            vDao.selectTotalizacaoEQuantidade();
            break;
        case 7:
            selectTotalizacaoEQuantidadeByMesEAno(s);
            break;
        default:
            break;
        }
    }

    private void selectTotalizacaoEQuantidadeByMesEAno(Scanner s) throws SQLException {
        String mes, ano, nome;
        System.out.println("\nDigite o mes: ");
        mes = s.nextLine();
        System.out.println("\nDigite o ano: ");
        ano = s.nextLine();
        System.out.println("\nDigite o nome: ");
        nome = s.nextLine();

        vDao.selectTotalizacaoEQuantidadeByMesEAno(nome, mes, ano);
    }

    private void selectByDescricaoMesAno(Scanner s) throws SQLException {
        String descricao, mes, ano;
        System.out.println("\nDigite a descrição: ");
        descricao = s.nextLine();
        System.out.println("\nDigite o mes: ");
        mes = s.nextLine();
        System.out.println("\nDigite o ano: ");
        ano = s.nextLine();

        vDao.selectByDescricaoMesAno(descricao, mes, ano);
    }
}