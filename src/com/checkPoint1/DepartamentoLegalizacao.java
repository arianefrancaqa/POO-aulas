package com.checkPoint1;

import java.time.LocalDate;

public class DepartamentoLegalizacao {

    private String nomeFantasia;
    private LocalDate dataAbertura;
    private Long cnpj;
    private Double faturamentoMensal;
    private Integer idFuncionario;

    public DepartamentoLegalizacao(String nomeFantasia, LocalDate dataAbertura, Long cnpj, Double faturamentoMensal, Integer idFuncionario) {
        this.nomeFantasia = nomeFantasia;
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
        this.faturamentoMensal = faturamentoMensal;
        this.idFuncionario = idFuncionario;
    }

    public void renovacaoAlvaras(){
        System.out.println("\nRenovação de Alvará para a empresa " + nomeFantasia + " cujo o CNPJ é " + cnpj+ " com o Faturamento mensal de " + faturamentoMensal+"\n");
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

    public Double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
