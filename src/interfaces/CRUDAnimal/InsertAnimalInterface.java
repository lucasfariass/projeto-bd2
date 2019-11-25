package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;
import dao.AnimalDAO;
import entidades.Animal;

public class InsertAnimalInterface {

    private AnimalDAO aDao = null;
    private Animal a = new Animal();

    public InsertAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.aDao = new AnimalDAO();
        System.out.println("Inserir na tabela animal");
        System.out.println("1 - Inserir com todos os dados");
        System.out.println("2 - Inserir sem peso, altura e data da ultima medicacao");
        System.out.println("3 - Inserir sem preço de venda");
        System.out.println("4 - Inserir sem preço de venda e preço de compra");
        System.out.println("5 - Inserir sem data de nascimento");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) {
        switch (nextInt) {
        case 1:
            inserirAnimal(s);
            break;

        case 2:
            inserirSemPesoAlturaDataUltMed(s);
            break;
        case 3:
            inserirSemPrecoVenda(s);
            break;
        case 4:
            inserirSemPrecoVendaPrecoCompra(s);
            break;
        case 5:
            inserirSemDataNasc(s);
            break;
        default:
            break;
        }
    }

    private void inserirSemDataNasc(Scanner s) {
        System.out.println("Digite o tipo:");
        a.setTipo(s.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(s.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(s.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(s.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(s.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(s.nextDouble());
        System.out.println("Digite o preço de venda:");
        a.setPrecoVenda(s.nextDouble());

        try {
            aDao.inserirSemDataNasc(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirSemPrecoVendaPrecoCompra(Scanner s) {
        System.out.println("Digite o tipo:");
        a.setTipo(s.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(s.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(s.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(s.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(s.nextLine());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(s.nextLine());

        try {
            aDao.inserirSemPrecoVendaPrecoCompra(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirSemPrecoVenda(Scanner s) {
        System.out.println("Digite o tipo:");
        a.setTipo(s.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(s.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(s.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(s.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(s.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(s.nextDouble());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(s.nextLine());

        try {
            aDao.inserirSemPrecoVenda(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirSemPesoAlturaDataUltMed(Scanner s) {
        System.out.println("Digite o tipo:");
        a.setTipo(s.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(s.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(s.nextDouble());
        System.out.println("Digite a raca:");
        a.setRaca(s.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(s.nextDouble());
        System.out.println("Digite o preço de venda:");
        a.setPrecoVenda(s.nextDouble());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(s.nextLine());

        try {
            aDao.inserirSemPesoAlturaDataUltMed(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirAnimal(Scanner s) {
        System.out.println("Digite o tipo:");
        a.setTipo(s.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(s.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(s.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(s.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(s.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(s.nextDouble());
        System.out.println("Digite o preço de venda:");
        a.setPrecoVenda(s.nextDouble());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(s.nextLine());

        try {
            aDao.inserirAnimal(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}