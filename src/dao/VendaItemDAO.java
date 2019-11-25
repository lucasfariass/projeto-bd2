package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conecta;
import entidades.VendaItem;

public class VendaItemDAO {

    private Connection con;

    public VendaItemDAO() throws ClassNotFoundException, SQLException {
        con = Conecta.criarConexao();
    }

    public void inserirVendaItem(VendaItem v) throws SQLException {
        String sql = "INSERT INTO venda_item(item_codigo, matricula_funcionario, dia, mes, ano, comissao_item, desconto, valor_final) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getItemCodigo());
        query.setInt(2, v.getMatriculaFuncionario());
        query.setInt(3, v.getDia());
        query.setInt(4, v.getMes());
        query.setInt(5, v.getAno());
        query.setDouble(6, v.getComissaoItem());
        query.setDouble(7, v.getDesconto());
        query.setDouble(8, v.getValorFinal());
        query.execute();
        query.close();
    }

    public void inserirSemDesconto(VendaItem v) throws SQLException {
        String sql = "INSERT INTO venda_item(item_codigo, matricula_funcionario, dia, mes, ano, comissao_item, valor_final) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getItemCodigo());
        query.setInt(2, v.getMatriculaFuncionario());
        query.setInt(3, v.getDia());
        query.setInt(4, v.getMes());
        query.setInt(5, v.getAno());
        query.setDouble(6, v.getComissaoItem());
        query.setDouble(7, v.getValorFinal());
        query.execute();
        query.close();
    }

    public void updateItemCodigo(VendaItem v) throws SQLException {
        String sql = "UPDATE venda_item SET item_codigo = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getItemCodigo());
        query.setInt(2, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void updateMatriculaFuncionario(VendaItem v) throws SQLException {
        String sql = "UPDATE venda_item SET matricula_funcionario = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getMatriculaFuncionario());
        query.setInt(2, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void updateDiaMesAno(VendaItem v) throws SQLException {
        String sql = "UPDATE venda_item SET dia = ?, mes = ?, ano = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, v.getDia());
        query.setInt(2, v.getMes());
        query.setInt(3, v.getAno());
        query.setInt(4, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void updateDesconto(VendaItem v) throws SQLException {
        String sql = "UPDATE venda_item SET desconto = ? WHERE nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setDouble(1, v.getDesconto());
        query.setInt(2, v.getNotaFiscal());
        query.execute();
        query.close();
    }

    public void deleteVendaItem(Integer notaFiscal) throws SQLException {
        String sql = "DELETE FROM venda_item v WHERE v.nota_fiscal = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, notaFiscal);
        query.execute();
        query.close();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM venda_item";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectByDescricao(String descricao) throws SQLException {
        String sql = "SELECT * FROM venda_item v, item i WHERE i.descricao = ? AND v.item_codigo = i.codigo";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, descricao);
        query.execute();
        query.close();
    }

    public void selectByNomeVendedor(String nome) throws SQLException {
        String sql = "SELECT * FROM venda_item v, funcionario f WHERE v.matricula_funcionario = f.matricula AND f.nome = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, nome);
        query.execute();
        query.close();
    }

    public void selectByDescricaoMesAno(String descricao, String mes, String ano) throws SQLException {
        String sql = "SELECT * FROM venda_item v, item i WHERE i.descricao = ? AND v.ano = ? AND v.mes = ? AND v.item_codigo = i.codigo";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, descricao);
        query.setString(2, ano);
        query.setString(3, mes);
        query.execute();
        query.close();
    }

    public void selectMatriculaCodigoEVendas() throws SQLException {
        String sql = "SELECT f.matricula, i.codigo, v FROM venda_item v, funcionario f, item i WHERE v.item_codigo = i.codigo AND v.matricula_funcionario =  f.matricula  GROUP BY i.codigo";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectTotalizacaoEQuantidade() throws SQLException {
        String sql = "SELECT f.matricula, i.tipo, count(*), sum(v.valor_final) - sum(i.preco_fornecedor) as total FROM venda_item v, item i, funcionario f WHERE v.item_codigo = i.codigo AND v.matricula_funcionario = f.matricula GROUP BY f.matricula";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectTotalizacaoEQuantidadeByMesEAno(String nome, String mes, String ano) throws SQLException {
        String sql = "SELECT f.matricula, i.tipo, count(*), sum(v.valor_final) - sum(i.preco_fornecedor) as total FROM venda_item v, item i, funcionario f WHERE v.item_codigo = i.codigo AND v.matricula_funcionario = f.matricula AND f.nome = ? AND v.mes = ? AND v.ano = ? GROUP BY f.matricula";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, nome);
        query.setString(2, mes);
        query.setString(3, ano);
        query.execute();
        query.close();
    }
}
