package interfaces.CRUDAnimal;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDAO;
import entidades.Animal;

public class UpdateAnimalInterface {
    private AnimalDAO aDao = null;
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
        switch (nextInt) {
        case 1:
            updatePesoAlturaDataUltMed(s);
            break;
        case 2:
            updateAlturaDataUltMed(s);
            break;
        case 3:
            updatePrecoVenda(s);
            break;
        case 4:
            updatePrecoCompra(s);
            break;
        case 5:
            updatePrecoVendaPrecoVenda(s);
            break;
        default:
            break;
        }
    }

    private void updatePrecoVendaPrecoVenda(Scanner s) {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(s.nextInt());
        System.out.println("Digite o novo preço de compra:");
        a.setPrecoCompra(s.nextDouble());
        System.out.println("Digite o novo preço de venda:");
        a.setPrecoVenda(s.nextDouble());

        try {
            aDao.updatePrecoVendaPrecoCompra(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updatePrecoCompra(Scanner s) {
        Animal a = new Animal();
        System.out.println("Digite o registro do animal:");
        a.setRegistro(s.nextInt());
        System.out.println("Digite o novo preço de compra:");
        a.setPrecoCompra(s.nextDouble());

        try {
            aDao.updatePrecoCompra(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void updatePrecoVenda(Scanner s) {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(s.nextInt());
        System.out.println("Digite o novo preço de venda:");
        a.setPrecoVenda(s.nextDouble());

        try {
            aDao.updatePrecoVenda(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateAlturaDataUltMed(Scanner s) {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(s.nextInt());
        System.out.println("Digite a nova altura:");
        a.setAltura(s.nextDouble());
        System.out.println("Digite nova data da ultima medicação:");
        a.setDataUltimaMedicacao(s.nextLine());

        try {
            aDao.updateAlturaDataUltMed(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updatePesoAlturaDataUltMed(Scanner s) {
        System.out.println("Digite o registro do animal:");
        a.setRegistro(s.nextInt());
        System.out.println("Digite a nova altura:");
        a.setAltura(s.nextDouble());
        System.out.println("Digite o novo peso:");
        a.setPeso(s.nextDouble());
        System.out.println("Digite nova data da ultima medicação:");
        a.setDataUltimaMedicacao(s.nextLine());

        try {
            aDao.updatePesoAlturaDataUltMed(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}