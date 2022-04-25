package com.regina;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private  Double valorBonificacao;

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco='" + super.getEndereco() + '\'' +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';

    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {

    }
}
