package interfaces.CRUDVendaItem;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaItemDAO;

public class SelectVendaItemInterface {

    private VendaItemDAO vDao;

    public SelectVendaItemInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaItemDAO();
        System.out.println("Selecionar da tabela venda item");
        System.out.println("1 - Selecionar tudo");
        System.out.println("2 - Selecionar pela descrição");
        System.out.println("3 - Selecionar pelo nome do vendedor");
        System.out.println("4 - Selecionar pelo mes e ano e descrição");
        System.out.println("5 - Selecionar matricula e codigo");
        System.out.println("6 - Selecionar totalização e quantidade");
        System.out.println("7 - Selecionar totalização e quantidade pelo mes e ano");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            vDao.selectAll();
            break;
        case 2:
            System.out.println("Digite a descrição: ");
            vDao.selectByDescricao(s.nextLine());
            break;
        case 3:
            System.out.println("Digite o nome: ");
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
        System.out.println("Digite o mes: ");
        mes = s.nextLine();
        System.out.println("Digite o ano: ");
        ano = s.nextLine();
        System.out.println("Digite o nome: ");
        nome = s.nextLine();

        vDao.selectTotalizacaoEQuantidadeByMesEAno(nome, mes, ano);
    }

    private void selectByDescricaoMesAno(Scanner s) throws SQLException {
        String descricao, mes, ano;
        System.out.println("Digite a descrição: ");
        descricao = s.nextLine();
        System.out.println("Digite o mes: ");
        mes = s.nextLine();
        System.out.println("Digite o ano: ");
        ano = s.nextLine();

        vDao.selectByDescricaoMesAno(descricao, mes, ano);
    }
}