package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDAO;
import entidades.Animal;

public class UpdateAnimalInterface {
    private AnimalDAO aDao = null;
    private Scanner sInt;
	private Scanner sLine;
	private Scanner sDouble;
    private Animal a = new Animal();

    public UpdateAnimalInterface(Scanner s) throws ClassNotFoundException, SQLException {
        this.aDao = new AnimalDAO();
        System.out.println("Atualizar na tabela animal");
        System.out.println("1 - Atualizar peso, altura e data da ultima medicação");
        System.out.println("2 - Atualizar a altura e data da ultima medicação");
        System.out.println("3 - Atualizar preço de venda");
        System.out.println("4 - Atualizar preço de compra");
        System.out.println("5 - Atualizar preço de venda e preço de compra");
        opcao(s.nextInt(), s);
    }

    private void opcao(int nextInt, Scanner s) {
    	iniciarScanners();
        switch (nextInt) {
        case 1:
            updatePesoAlturaDataUltMed();
            break;
        case 2:
            updateAlturaDataUltMed();
            break;
        case 3:
            updatePrecoVenda();
            break;
        case 4:
            updatePrecoCompra();
            break;
        case 5:
            updatePrecoVendaPrecoVenda();
            break;
        default:
            break;
        }
    }

    private void updatePrecoVendaPrecoVenda() {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(sInt.nextInt());
        System.out.println("Digite o novo preço de compra:");
        a.setPrecoCompra(sDouble.nextDouble());
        System.out.println("Digite o novo preço de venda:");
        a.setPrecoVenda(sDouble.nextDouble());

        try {
            aDao.updatePrecoVendaPrecoCompra(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updatePrecoCompra() {
        Animal a = new Animal();
        System.out.println("Digite o registro do animal:");
        a.setRegistro(sInt.nextInt());
        System.out.println("Digite o novo preço de compra:");
        a.setPrecoCompra(sDouble.nextDouble());

        try {
            aDao.updatePrecoCompra(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void updatePrecoVenda() {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(sInt.nextInt());
        System.out.println("Digite o novo preço de venda:");
        a.setPrecoVenda(sDouble.nextDouble());

        try {
            aDao.updatePrecoVenda(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateAlturaDataUltMed() {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(sInt.nextInt());
        System.out.println("Digite a nova altura:");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite nova data da ultima medicação:");
        a.setDataUltimaMedicacao(sLine.nextLine());

        try {
            aDao.updateAlturaDataUltMed(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updatePesoAlturaDataUltMed() {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(sInt.nextInt());
        System.out.println("Digite a nova altura:");
        a.setAltura(sDouble.nextDouble());
        System.out.println("Digite o novo peso:");
        a.setPeso(sDouble.nextDouble());
        System.out.println("Digite nova data da ultima medicação:");
        a.setDataUltimaMedicacao(sLine.nextLine());

        try {
            aDao.updatePesoAlturaDataUltMed(a);
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