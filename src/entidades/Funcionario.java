package entidades;

import java.time.LocalDateTime;

public class Funcionario {
	
	private Integer matricula;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Double salario;
	private LocalDateTime dataNascimento;
	private LocalDateTime dataAdmissao;
	private String funcao;
	private LocalDateTime dataDemissao;

	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDateTime getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDateTime dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public LocalDateTime getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(LocalDateTime dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

}
