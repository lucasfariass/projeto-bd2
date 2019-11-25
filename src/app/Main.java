package app;

import java.sql.SQLException;
import java.util.Scanner;

import conexao.Conecta;
import interfaces.AnimalInterface;
import interfaces.FuncionarioInterface;
import interfaces.ItemInterface;
import interfaces.VendaAnimalInterface;
import interfaces.VendaItemInterface;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Conecta con = new Conecta();

		try {
			con.criarConexao();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Scanner s = new Scanner(System.in);
		System.out.println("Digite 1 para mexer na tabela Animal");
		System.out.println("Digite 2 para mexer na tabela Funcionario");
		System.out.println("Digite 3 para mexer na tabela Item");
		System.out.println("Digite 4 para mexer na tabela VendaAnimal");
		System.out.println("Digite 5 para mexer na tabela VendaItem");

		switch (s.nextInt()) {
		case 1:
			new AnimalInterface(s);
			break;
		case 2:
			new FuncionarioInterface(s);
			break;
		case 3:
			new ItemInterface(s);
			break;
		case 4:
			new VendaAnimalInterface(s);
			break;
		case 5:
			new VendaItemInterface(s);
			break;
		default:
			break;
		}
	}

}
