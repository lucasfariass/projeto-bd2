package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import conexao.Conecta;
import entidades.Funcionario;

public class FuncionarioDAO {

    private Connection con;

    public FuncionarioDAO() throws ClassNotFoundException, SQLException {
        con = Conecta.criarConexao();
    }

    public void inserirFuncionario(Funcionario f) throws SQLException {
        String sql = "INSERT INTO funcionario(nome, cpf, endereco, telefone, salario, data_nascimento, data_admissao, funcao, data_demissao) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getNome());
        query.setString(2, f.getEndereco());
        query.setString(3, f.getTelefone());
        query.setDouble(4, f.getSalario());
        query.setObject(5, f.getDataNascimento(), Types.TIMESTAMP);
        query.setObject(6, f.getDataAdmissao(), Types.TIMESTAMP);
        query.setString(7, f.getFuncao());
        query.setObject(6, f.getDataDemissao(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void inserirSemSalario(Funcionario f) throws SQLException {
        String sql = "INSERT INTO funcionario(nome, cpf, endereco, telefone, data_nascimento, data_admissao, funcao, data_demissao) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getNome());
        query.setString(2, f.getEndereco());
        query.setString(3, f.getTelefone());
        query.setObject(4, f.getDataNascimento(), Types.TIMESTAMP);
        query.setObject(5, f.getDataAdmissao(), Types.TIMESTAMP);
        query.setString(6, f.getFuncao());
        query.setObject(7, f.getDataDemissao(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void inserirSemTelefone(Funcionario f) throws SQLException {
        String sql = "INSERT INTO funcionario(nome, cpf, endereco, salario, data_nascimento, data_admissao, funcao, data_demissao) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getNome());
        query.setString(2, f.getEndereco());
        query.setDouble(3, f.getSalario());
        query.setObject(4, f.getDataNascimento(), Types.TIMESTAMP);
        query.setObject(5, f.getDataAdmissao(), Types.TIMESTAMP);
        query.setString(6, f.getFuncao());
        query.setObject(7, f.getDataDemissao(), Types.TIMESTAMP);
        query.execute();
        query.close();
    }

    public void updateNomePorMatricula(Funcionario f) throws SQLException {
        String sql = "UPDATE funcionario SET nome = ? WHERE matricula = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getNome());
        query.setInt(2, f.getMatricula());
        query.execute();
        query.close();
    }

    public void updateNomePorCPF(Funcionario f) throws SQLException {
        String sql = "UPDATE funcionario SET nome = ? WHERE cpf = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getNome());
        query.setString(2, f.getCpf());
        query.execute();
        query.close();
    }

    public void updateEnderecoPorMatricula(Funcionario f) throws SQLException {
        String sql = "UPDATE funcionario SET endereco = ? WHERE matricula = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getEndereco());
        query.setLong(2, f.getMatricula());
        query.execute();
        query.close();
    }

    public void updateFuncaoPorMatricula(Funcionario f) throws SQLException {
        String sql = "UPDATE funcionario SET funcao = ? WHERE matricula = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, f.getFuncao());
        query.setLong(2, f.getMatricula());
        query.execute();
        query.close();
    }

    public void updateDataDemissaoPorMatricula(Funcionario f) throws SQLException {
        String sql = "UPDATE funcionario SET data_demissao = ? WHERE matricula = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setObject(1, f.getDataDemissao(), Types.TIMESTAMP);
        query.setLong(2, f.getMatricula());
        query.execute();
        query.close();
    }

    public void deleteFuncionario(Integer matricula) throws SQLException {
        String sql = "DELETE FROM funcionario f WHERE f.matricula = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setInt(1, matricula);
        query.execute();
        query.close();
    }

    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM Funcionario";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

    public void selectByNome(String nome) throws SQLException {
        String sql = "SELECT * FROM funcionario f WHERE f.nome = ?";
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, nome);
        query.execute();
        query.close();
    }

    // BOTAR A FUNCAO AQUI
    public void selectDadosByMeseAno(String mes, String ano) throws SQLException {
        String sql = "SELECT f.matriula, f.nome, f.salario FROM funcionario f WHERE";
        PreparedStatement query = con.prepareStatement(sql);
        query.execute();
        query.close();
    }

}
