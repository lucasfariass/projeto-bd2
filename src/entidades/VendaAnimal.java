package entidades;

public class VendaAnimal {
    private Integer notaFiscal;
    private Integer registroAnimal;
    private Integer matriculaFuncionario;
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Double comissaoAnimal;
    private Double desconto;
    private Double valorFinal;

    public Double getValorFinal() {
        return valorFinal;
    }

    public Integer getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Integer notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Integer getRegistroAnimal() {
        return registroAnimal;
    }

    public void setRegistroAnimal(Integer registroAnimal) {
        this.registroAnimal = registroAnimal;
    }

    public Integer getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(Integer matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getComissaoAnimal() {
        return comissaoAnimal;
    }

    public void setComissaoAnimal(Double comissaoAnimal) {
        this.comissaoAnimal = comissaoAnimal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

}