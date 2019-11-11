package entidades;

import java.time.LocalDateTime;

public class Item {
	
	private Integer codigo;
	private String descricao;
	private String tipo;
	private Double precoFornecedor;
	private Double precoLoja;
	private LocalDateTime dataValidade;
	private Integer qtdEstoque;

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPrecoFornecedor() {
		return precoFornecedor;
	}
	public void setPrecoFornecedor(Double precoFornecedor) {
		this.precoFornecedor = precoFornecedor;
	}
	public Double getPrecoLoja() {
		return precoLoja;
	}
	public void setPrecoLoja(Double precoLoja) {
		this.precoLoja = precoLoja;
	}
	public LocalDateTime getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDateTime dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Integer getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}
