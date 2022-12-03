package com.checkPoint2;

import java.time.LocalDate;

public class DepartamentoLegalizacao extends Departamento{

    private String nomeFantasia;
    private LocalDate dataAbertura;
    private Long cnpj;
    private double faturamentoMensal;
    private double custasAdvogados;

    public DepartamentoLegalizacao(String nomeDepartamento, Integer idFuncionario, double custas, String nomeFantasia, LocalDate dataAbertura, Long cnpj, double faturamentoMensal) {
        super(nomeDepartamento, idFuncionario, custas);
        this.nomeFantasia = nomeFantasia;
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
        this.faturamentoMensal = faturamentoMensal;
    }

    public void renovacaoAlvaras(){
        System.out.println("\nRenovação de Alvará para a empresa " +
                nomeFantasia + " cujo o CNPJ é " + cnpj+
                " com o Faturamento mensal de " + faturamentoMensal+"\n");
    }

    @Override
    public double calcularCustas() {
        return this.getCustas() + custasAdvogados;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public double getCustasAdvogados() {
        return custasAdvogados;
    }

    public void setCustasAdvogados(double custasAdvogados) {
        this.custasAdvogados = custasAdvogados;
    }
}
