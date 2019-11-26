package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;
import dao.AnimalDAO;
import entidades.Animal;

public class InsertAnimalInterface {

    private AnimalDAO aDao = null;
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;
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
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            inserirAnimal();
            break;

        case 2:
            inserirSemPesoAlturaDataUltMed();
            break;
        case 3:
            inserirSemPrecoVenda();
            break;
        case 4:
            inserirSemPrecoVendaPrecoCompra();
            break;
        case 5:
            inserirSemDataNasc();
            break;
        default:
            break;
        }
    }

    private void inserirSemDataNasc() {
        System.out.println("Digite o tipo:");
        a.setTipo(sLine.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(sDouble.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(sLine.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(sLine.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(sDouble.nextDouble());
        System.out.println("Digite o preço de venda:");
        a.setPrecoVenda(sDouble.nextDouble());

        try {
            aDao.inserirSemDataNasc(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirSemPrecoVendaPrecoCompra() {
        System.out.println("Digite o tipo:");
        a.setTipo(sLine.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(sDouble.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(sLine.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(sLine.nextLine());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(sLine.nextLine());

        try {
            aDao.inserirSemPrecoVendaPrecoCompra(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirSemPrecoVenda() {
        System.out.println("Digite o tipo:");
        a.setTipo(sLine.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(sDouble.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(sLine.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(sLine.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(sDouble.nextDouble());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(sLine.nextLine());

        try {
            aDao.inserirSemPrecoVenda(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirSemPesoAlturaDataUltMed() {
        System.out.println("Digite o tipo:");
        a.setTipo(sLine.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(sDouble.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite a raca:");
        a.setRaca(sLine.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(sDouble.nextDouble());
        System.out.println("Digite o preço de venda:");
        a.setPrecoVenda(sDouble.nextDouble());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(sLine.nextLine());

        try {
            aDao.inserirSemPesoAlturaDataUltMed(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirAnimal() {
        System.out.println("Digite o tipo:");
        a.setTipo(sLine.nextLine());
        System.out.println("Digite o peso:");
        a.setPeso(sDouble.nextDouble());
        System.out.println("Digite a altura: ");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite a data da ultima medicacao");
        a.setDataUltimaMedicacao(sLine.nextLine());
        System.out.println("Digite a raca:");
        a.setRaca(sLine.nextLine());
        System.out.println("Digite o preço de compra:");
        a.setPrecoCompra(sDouble.nextDouble());
        System.out.println("Digite o preço de venda:");
        a.setPrecoVenda(sDouble.nextDouble());
        System.out.println("Digite a data de nascimento");
        a.setDataNascimento(sLine.nextLine());

        try {
            aDao.inserirAnimal(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void iniciarScanners() {
    	sInt = new Scanner(System.in);
    	sLine = new Scanner(System.in);
    	sDouble = new Scanner(System.in);
    }

}