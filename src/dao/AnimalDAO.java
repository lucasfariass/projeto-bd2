package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import conexao.Conecta;
import entidades.Animal;

public class AnimalDAO {

    private Connection con;

    public AnimalDAO() throws ClassNotFoundException, SQLException {
        con = Conecta.criarConexao();
    }

    public void inserirAnimal(Animal a) throws SQLException {
        String sql = "INSERT INTO animal(tipo, peso, altura, data_ultima_medicacao, raca, preco_compra, preco_venda, data_nascimento) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setLong(1, a.getRegistro());
        query.setDouble(2, a.getPeso());
        query.setDouble(3, a.getAltura());
        query.setObject(4, a.getDataUltimaMedicacao(), Types.TIMESTAMP);
        query.setString(5, a.getRaca());
        query.setDouble(6, a.getPrecoCompra());
        query.setDouble(7, a.getPrecoVenda());
        query.setObject(8, a.getDataNascimento(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void inserirSemPesoAlturaDataUltMed(Animal a) throws SQLException {
        String sql = "INSERT INTO animal(tipo, raca, preco_compra, preco_venda, data_nascimento) VALUES (?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setLong(1, a.getRegistro());
        query.setString(2, a.getRaca());
        query.setDouble(3, a.getPrecoCompra());
        query.setDouble(4, a.getPrecoVenda());
        query.setObject(8, a.getDataNascimento(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void inserirSemPrecoVenda(Animal a) throws SQLException {
        String sql = "INSERT INTO animal(tipo, peso, altura, data_ultima_medicacao, raca, preco_compra, data_nascimento) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setLong(1, a.getRegistro());
        query.setDouble(2, a.getPeso());
        query.setDouble(3, a.getAltura());
        query.setObject(4, a.getDataUltimaMedicacao(), Types.TIMESTAMP);
        query.setString(5, a.getRaca());
        query.setDouble(6, a.getPrecoCompra());
        query.setObject(8, a.getDataNascimento(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void inserirSemPrecoVendaPrecoCompra(Animal a) throws SQLException {
        String sql = "INSERT INTO animal(tipo, peso, altura, data_ultima_medicacao, raca, data_nascimento) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setLong(1, a.getRegistro());
        query.setDouble(2, a.getPeso());
        query.setDouble(3, a.getAltura());
        query.setObject(4, a.getDataUltimaMedicacao(), Types.TIMESTAMP);
        query.setString(5, a.getRaca());
        query.setObject(8, a.getDataNascimento(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void inserirSemDataNasc(Animal a) throws SQLException {
        String sql = "INSERT INTO animal(tipo, peso, altura, data_ultima_medicacao, raca, preco_compra, preco_venda) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setLong(1, a.getRegistro());
        query.setDouble(2, a.getPeso());
        query.setDouble(3, a.getAltura());
        query.setObject(4, a.getDataUltimaMedicacao(), Types.TIMESTAMP);
        query.setString(5, a.getRaca());
        query.setDouble(6, a.getPrecoCompra());
        query.setDouble(7, a.getPrecoVenda());
        query.execute();
        query.close();
    }

    public void updatePesoAlturaDataUltMed(Animal a) throws SQLException {
        String sql = "UPDATE animal SET peso = ?, altura = ?, data_ultima_medicacao = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, a.getPeso());
        query.setDouble(2, a.getAltura());
        query.setObject(3, a.getDataUltimaMedicacao(), Types.TIMESTAMP);
        query.setLong(4, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updateAlturaDataUltMed(Animal a) throws SQLException {
        String sql = "UPDATE animal SET altura = ?, data_ultima_medicacao = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, a.getAltura());
        query.setObject(2, a.getDataUltimaMedicacao(), Types.TIMESTAMP);
        query.setLong(3, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updatePrecoVenda(Animal a) throws SQLException {
        String sql = "UPDATE animal SET preco_venda = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, a.getPrecoVenda());
        query.setLong(2, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updatePrecoCompra(Animal a) throws SQLException {
        String sql = "UPDATE animal SET preco_compra = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, a.getPrecoCompra());
        query.setLong(2, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updatePrecoVendaPrecoCompra(Animal a) throws SQLException {
        String sql = "UPDATE animal SET preco_venda = ?, preco_compra = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, a.getPrecoVenda());
        query.setDouble(2, a.getPrecoCompra());
        query.setLong(3, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updateTipo(Animal a) throws SQLException {
        String sql = "UPDATE animal SET tipo = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, a.getTipo());
        query.setLong(2, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updateRaca(Animal a) throws SQLException {
        String sql = "UPDATE animal SET raca = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, a.getRaca());
        query.setLong(2, a.getRegistro());
        query.execute();
        query.close();
    }

    public void updateTipoRaca(Animal a) throws SQLException {
        String sql = "UPDATE animal SET tipo = ?, raca = ? WHERE registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, a.getTipo());
        query.setString(2, a.getRaca());
        query.setLong(3, a.getRegistro());
        query.execute();
        query.close();
    }

    public void deleteAnimal(int registro) throws SQLException {
        String sql = "DELETE FROM animal a WHERE a.registro = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, registro);
        query.execute();
        query.close();
    }

    public void deletePorTipo(String tipo) throws SQLException {
        String sql = "DELETE FROM animal a WHERE a.tipo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, tipo);
        query.execute();
        query.close();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM animal";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectPorTipo(String tipo) throws SQLException {
        String sql = "SELECT * FROM animal a Where a.tipo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, tipo);
        query.execute();
        query.close();
    }

    public void selectPorPrecoDeVenda(Double preco) throws SQLException {
        String sql = "SELECT * FROM animal a Where a.preco_venda <= ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, preco);
        query.execute();
        query.close();
    }

    public void selectTotalizacao() throws SQLException {
        String sql = "SELECT count(*), MAX(a.preco_venda), MIN(a.preco_venda) FROM animal a GROUP BY a.tipo";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectLucro() throws SQLException {
        String sql = "SELECT a.preco_compra - a.preco_venda FROM animal a";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

}
