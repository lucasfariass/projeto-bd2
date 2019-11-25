package interfaces.CRUDVendaAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaAnimalDAO;

public class SelectVendaAnimalInterface {

    private VendaAnimalDAO vDao;

    public SelectVendaAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaAnimalDAO();
        System.out.println("Selecionar da tabela venda animal");
        System.out.println("1 - Selecionar tudo");
        System.out.println("2 - Selecionar pelo tipo");
        System.out.println("3 - Selecionar pelo nome do vendedor");
        System.out.println("4 - Selecionar pelo mes, ano e tipo");
        System.out.println("5 - Selecionar pelo nome do vendedor e tipo do animal");
        System.out.println("6 - Selecionar totalização");
        System.out.println("7 - Selecionar totalização pelo nome do vendedor, mes e ano");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            vDao.selectAll();
            break;
        case 2:
            System.out.println("Digite o tipo: ");
            vDao.selectByTipo(s.nextLine());
            break;
        case 3:
            System.out.println("Digite o nome: ");
            vDao.selectByNomeVendedor(s.nextLine());
        case 4:
            selectByMesAnoeTipo(s);
            break;
        case 5:
            selectByNomeVendedorETipoAnimal(s);
            break;
        case 6:
            vDao.selectTotalizacaoFuncionarioETipoAnimal();
            break;
        case 7:
            selectTotalizacaoFuncionarioETipoAnimalByMesAno(s);
            break;
        default:
            break;
        }
    }

    private void selectTotalizacaoFuncionarioETipoAnimalByMesAno(Scanner s) throws SQLException {
        String nome, mes, ano;
        System.out.println("Digite o nome: ");
        nome = s.nextLine();
        System.out.println("Digite o ano: ");
        ano = s.nextLine();
        System.out.println("Digite o mes: ");
        mes = s.nextLine();

        vDao.selectTotalizacaoFuncionarioETipoAnimalByMesAno(nome, ano, mes);
    }

    private void selectByNomeVendedorETipoAnimal(Scanner s) throws SQLException {
        String nome, tipo;
        System.out.println("Digite o nome do vendedor: ");
        nome = s.nextLine();
        System.out.println("Digite o tipo do animal: ");
        tipo = s.nextLine();

        vDao.selectByNomeVendedorETipoAnimal(nome, tipo);
    }

    private void selectByMesAnoeTipo(Scanner s) throws SQLException {
        String mes, ano, tipo;
        System.out.println("Digite o mes: ");
        mes = s.nextLine();
        System.out.println("Digite o ano: ");
        ano = s.nextLine();
        System.out.println("Digite o tipo: ");
        tipo = s.nextLine();

        vDao.selectByMesAnoeTipo(mes, ano, tipo);
    }

}