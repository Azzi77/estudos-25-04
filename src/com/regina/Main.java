package com.regina;

public class Main {

    public static void  main(String[] args) {
        Endereco endereco = new Endereco("Rua Funcionario", "complemento do endereco", "Bairro");

        System.out.println("---------");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Regina Vendedora");
        vendedor.setDocumento("263.942.998-12");
        vendedor.setValorSalario(2000d);
        vendedor.setEndereco(vendedor.endereco);
        vendedor.calculaBonificacao(2.0);
        System.out.println(vendedor);
        System.out.println("---------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Regina Caixa", "245.458.200-12", 1000d, "endereco");
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome( "Regina Gerente");
        gerente.setDocumento("245.487.263-15");
        gerente.setEndereco(endereco.rua);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);


    }
}
