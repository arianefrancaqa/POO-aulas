package com.checkPoint1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DepartamentoPessoal func1 = new DepartamentoPessoal("Jose", "Souza", 1, "Contratado");
        DepartamentoPessoal func2 = new DepartamentoPessoal("Maria", "Silva", 2, "Afastado");
        DepartamentoPessoal func3 = new DepartamentoPessoal("Juliana", "Rocha", 3, "Desligado");

        func1.calcularFolhaPagamentoFuncionarios(12000.00F, 3000.00F);
        func2.calcularFolhaPagamentoFuncionarios(5000.00F);

        DepartamentoContabil clienteContabil1 = new DepartamentoContabil(1, 150000.85,20000.00);
        clienteContabil1.calcularAtivo();

        DepartamentoFiscal clienteFiscal1 = new DepartamentoFiscal(2, 0.2, 258000.00);
        clienteFiscal1.calculaGuias();

        DepartamentoLegalizacao clienteLegalizacao1 = new DepartamentoLegalizacao("Ari&De IT Consulting", LocalDate.now(), 2215455454545146L, 15230.00, 3 );
        clienteLegalizacao1.renovacaoAlvaras();
    }
}
