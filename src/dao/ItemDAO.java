package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import conexao.Conecta;
import entidades.Item;

public class ItemDAO {

    private Connection con;

    public ItemDAO() throws ClassNotFoundException, SQLException {
        con = Conecta.criarConexao();
    }

    public void inserirItem(Item i) throws SQLException {
        String sql = "INSERT INTO item(descricao, tipo, preco_fornecedor, preco_loja, data_validade, qtd_estoque) VALUES(?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, i.getDescricao());
        query.setString(2, i.getTipo());
        query.setDouble(3, i.getPrecoFornecedor());
        query.setDouble(4, i.getPrecoLoja());
        query.setString(5, i.getDataValidade());
        query.setInt(6, i.getQtdEstoque());
        query.execute();
        query.close();
    }

    public void inserirSemValidade(Item i) throws SQLException {
        String sql = "INSERT INTO item(descricao, tipo, preco_fornecedor, preco_loja, qtd_estoque) VALUES(?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, i.getDescricao());
        query.setString(2, i.getTipo());
        query.setDouble(3, i.getPrecoFornecedor());
        query.setDouble(4, i.getPrecoLoja());
        query.setInt(5, i.getQtdEstoque());
        query.execute();
        query.close();
    }

    public void inserirSemPrecoLoja(Item i) throws SQLException {
        String sql = "INSERT INTO item(descricao, tipo, preco_fornecedor, data_validade, qtd_estoque) VALUES(?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, i.getDescricao());
        query.setString(2, i.getTipo());
        query.setDouble(3, i.getPrecoFornecedor());
        query.setObject(4, i.getDataValidade(), Types.TIMESTAMP);
        query.setInt(5, i.getQtdEstoque());
        query.execute();
        query.close();
    }

    public void updatePrecoFornecedor(Item i) throws SQLException {
        String sql = "UPDATE item SET preco_fornecedor = ? WHERE codigo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, i.getPrecoFornecedor());
        query.setLong(2, i.getCodigo());
        query.execute();
        query.close();
    }

    public void updatePrecoLoja(Item i) throws SQLException {
        String sql = "UPDATE item SET preco_loja = ? WHERE codigo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, i.getPrecoLoja());
        query.setLong(2, i.getCodigo());
        query.execute();
        query.close();
    }

    public void updatePrecoFornecedorPrecoLoja(Item i) throws SQLException {
        String sql = "UPDATE item SET preco_fornecedor = ?, preco_loja = ? WHERE codigo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, i.getPrecoFornecedor());
        query.setDouble(2, i.getPrecoLoja());
        query.setLong(3, i.getCodigo());
        query.execute();
        query.close();
    }

    public void updateDescricaoTipo(Item i) throws SQLException {
        String sql = "UPDATE item SET descricao = ?, tipo = ? WHERE codigo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, i.getDescricao());
        query.setString(2, i.getTipo());
        query.setLong(3, i.getCodigo());
        query.execute();
        query.close();
    }

    public void deleteItem(Integer codigo) throws SQLException {
        String sql = "DELETE FROM item i WHERE i.codigo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, codigo);
        query.execute();
        query.close();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM item";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectByDescricao(String descricao) throws SQLException {
        String sql = "SELECT * FROM item i WHERE i.descricao = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, descricao);
        query.execute();
        query.close();
    }

    public void selectByTipo(String tipo) throws SQLException {
        String sql = "SELECT * FROM item i WHERE i.tipo = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, tipo);
        query.execute();
        query.close();
    }

    public void selectTotalizacao() throws SQLException {
        String sql = "SELECT (i.preco_loja - i.preco-fornecedor) as total_do_tipo, i.tipo, i.quantidade FROM item i GROUP BY i.tipo, i.quantidade";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectLucro() throws SQLException {
        String sql = "SELECT (i.preco_loja - i.preco_fornecedor) as lucro FROM Funcionario";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }
}
