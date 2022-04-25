package com.regina;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private String endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    public void calculaRemuneracao(){
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                '}';
    }
}
