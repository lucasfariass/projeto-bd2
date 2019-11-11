package entidades;

import java.time.LocalDateTime;

public class Animal {
	
	private Integer registro;
	private String tipo;
	private Double peso;
	private Double altura;
	private LocalDateTime dataUltimaMedicacao;
	private String raca;
	private Double precoCompra;
	private Double precoVenda;
	private LocalDateTime dataNascimento;

	public Integer getRegistro() {
		return registro;
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public LocalDateTime getDataUltimaMedicacao() {
		return dataUltimaMedicacao;
	}
	public void setDataUltimaMedicacao(LocalDateTime dataUltimaMedicacao) {
		this.dataUltimaMedicacao = dataUltimaMedicacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
