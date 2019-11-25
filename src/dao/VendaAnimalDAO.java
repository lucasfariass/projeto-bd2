package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conecta;
import entidades.VendaAnimal;

public class VendaAnimalDAO {

    private Connection con;

    public VendaAnimalDAO() throws ClassNotFoundException, SQLException {
        con = Conecta.criarConexao();
    }

    public void inserirVendaAnimal(VendaAnimal v) throws SQLException {
        String sql = "INSERT INTO venda_animal(registro_animal, matricula_funcionario, dia, mes, ano, comissao_animal, desconto, valor_final) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getRegistroAnimal());
        query.setInt(2, v.getMatriculaFuncionario());
        query.setInt(3, v.getDia());
        query.setInt(4, v.getMes());
        query.setInt(5, v.getAno());
        query.setDouble(6, v.getComissaoAnimal());
        query.setDouble(7, v.getDesconto());
        query.setDouble(8, v.getValorFinal());
        query.execute();
        query.close();
    }

    public void inserirSemDesconto(VendaAnimal v) throws SQLException {
        String sql = "INSERT INTO venda_animal(registro_animal, matricula_funcionario, dia, mes, ano, comissao_animal, valor_final) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getRegistroAnimal());
        query.setInt(2, v.getMatriculaFuncionario());
        query.setInt(3, v.getDia());
        query.setInt(4, v.getMes());
        query.setInt(5, v.getAno());
        query.setDouble(6, v.getComissaoAnimal());
        query.setDouble(7, v.getValorFinal());
        query.execute();
        query.close();
    }

    public void updateRegistroAnimal(VendaAnimal v) throws SQLException {
        String sql = "UPDATE venda_animal SET registro_animal = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getRegistroAnimal());
        query.setInt(2, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void updateMatriculaFuncionario(VendaAnimal v) throws SQLException {
        String sql = "UPDATE venda_animal SET matricula_funcionario = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getMatriculaFuncionario());
        query.setInt(2, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void updateDiaMesAno(VendaAnimal v) throws SQLException {
        String sql = "UPDATE venda_animal SET dia = ?, mes = ?, ano = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getDia());
        query.setInt(2, v.getMes());
        query.setInt(3, v.getAno());
        query.setInt(4, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void updateDesconto(VendaAnimal v) throws SQLException {
        String sql = "UPDATE venda_animal SET desconto = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, v.getDesconto());
        query.setInt(2, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void deleteVendaAnimal(Integer notaFiscal) throws SQLException {
        String sql = "DELETE FROM venda_animal WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, notaFiscal);
        query.execute();
        query.close();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM venda_animal";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectByTipo(String tipo) throws SQLException {
        String sql = "SELECT v FROM venda_animal v, Animal a WHERE v.tipo = ? AND a.Registro = v.registro_animal";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, tipo);
        query.execute();
        query.close();
    }

    public void selectByNomeVendedor(String nome) throws SQLException {
        String sql = "SELECT v FROM venda_animal v, funcionario f WHERE f.matricula = ? AND f.matricula = v.matricula_funcionario";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectByMesAnoeTipo(String mes, String ano, String tipo) throws SQLException {
        String sql = "SELECT v FROM venda_animal v, animal a WHERE v.mes = ? AND v.ano = ? AND a.tipo = ? AND a.registro = v.registro_animal";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, mes);
        query.setString(2, ano);
        query.setString(3, tipo);
        query.execute();
        query.close();
    }

    public void selectByNomeVendedorETipoAnimal(String nome, String tipo) throws SQLException {
        String sql = "SELECT v FROM venda_animal v, Funcionario f, Animal a WHERE a.tipo = ? AND f.nome = ? AND v.registro_animal = a.registro AND a.matricula_funcionario = f.matricula";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, tipo);
        query.setString(2, nome);
        query.execute();
        query.close();
    }

    public void selectTotalizacaoFuncionarioETipoAnimal() throws SQLException {
        String sql = "SELECT f.matricula, a.tipo, v.valor_final FROM funcionario f, animal a, venda_animal v WHERE v.registro_animal = a.registro and a.matricula_funcionario = f.matricula GROUP BY f.matricula, a.tipo";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectTotalizacaoFuncionarioETipoAnimalByMesAno(String nome, String ano, String mes)
            throws SQLException {
        String sql = "SELECT f.matricula, a.tipo, v.valor_final FROM funcionario f, animal a, venda_animal v WHERE v.registro_animal = a.registro and a.matricula_funcionario = f.matricula GROUP BY f.matricula, a.tipo AND f.nome = ? AND v.mes = ? AND v.ano = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, nome);
        query.setString(2, mes);
        query.setString(3, ano);
        query.execute();
        query.close();
    }
}
