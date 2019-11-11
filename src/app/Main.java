package app;

import conexao.Conecta;

public class Main {

	public static void main(String[] args) {
		Conecta con = new Conecta();
		
		try {
			con.criarConexao();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
