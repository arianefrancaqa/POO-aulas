package com.checkPoint1;

public class DepartamentoFiscal {
    private Integer idFuncionario;
    private Double impostos;
    private Double faturamentoEmpresa;

    public DepartamentoFiscal(Integer idFuncionario, Double impostos, Double faturamentoEmpresa) {
        this.idFuncionario = idFuncionario;
        this.impostos = impostos;
        this.faturamentoEmpresa = faturamentoEmpresa;
    }
    //Impostos devem ser em número decimal entre 0.1.. até 0.9..
    public void calculaGuias(){
        Double valorGuia = faturamentoEmpresa * impostos;
        System.out.println("O valor da sua guia é de: R$" + valorGuia + " -----> Id Funcionário responsável pela emissão da guia: " + idFuncionario);
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Double getImpostos() {
        return impostos;
    }

    public void setImpostos(Double impostos) {
        this.impostos = impostos;
    }

    public Double getFaturamentoEmpresa() {
        return faturamentoEmpresa;
    }

    public void setFaturamentoEmpresa(Double faturamentoEmpresa) {
        this.faturamentoEmpresa = faturamentoEmpresa;
    }
}
