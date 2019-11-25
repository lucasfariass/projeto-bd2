package interfaces.CRUDVendaAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.VendaAnimalDAO;
import entidades.VendaAnimal;

public class InsertVendaAnimalInterface {

    private VendaAnimalDAO vDao;
    private VendaAnimal v = new VendaAnimal();

    public InsertVendaAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.vDao = new VendaAnimalDAO();
        System.out.println("Inserir na tabela venda animal");
        System.out.println("1 - Inserir com todos os dados");
        System.out.println("2 - Inserir sem desconto");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) throws SQLException {
        switch (nextInt) {
        case 1:
            inserirVendaAnimal(s);
            break;
        case 2:
            inserirSemDesconto(s);
            break;
        default:
            break;
        }
    }

    private void inserirSemDesconto(Scanner s) throws SQLException {
        System.out.println("Digite o registro do animal:");
        v.setRegistroAnimal(s.nextInt());
        System.out.println("Digite a matricula do funcionario:");
        v.setMatriculaFuncionario(s.nextInt());
        System.out.println("Digite o dia: ");
        v.setDia(s.nextInt());
        System.out.println("Digite o mes");
        v.setMes(s.nextInt());
        System.out.println("Digite o ano:");
        v.setAno(s.nextInt());
        System.out.println("Digite a comissao:");
        v.setComissaoAnimal(s.nextDouble());
        System.out.println("Digite o valor final");
        v.setValorFinal(s.nextDouble());

        vDao.inserirSemDesconto(v);
    }

    private void inserirVendaAnimal(Scanner s) throws SQLException {
        System.out.println("Digite o registro do animal:");
        v.setRegistroAnimal(s.nextInt());
        System.out.println("Digite a matricula do funcionario:");
        v.setMatriculaFuncionario(s.nextInt());
        System.out.println("Digite o dia: ");
        v.setDia(s.nextInt());
        System.out.println("Digite o mes");
        v.setMes(s.nextInt());
        System.out.println("Digite o ano:");
        v.setAno(s.nextInt());
        System.out.println("Digite a comissao:");
        v.setComissaoAnimal(s.nextDouble());
        System.out.println("Digite o desconto");
        v.setDesconto(s.nextDouble());
        System.out.println("Digite o valor final");
        v.setValorFinal(s.nextDouble());

        vDao.inserirVendaAnimal(v);
    }
}