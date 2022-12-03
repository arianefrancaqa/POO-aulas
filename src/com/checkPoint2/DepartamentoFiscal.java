package com.checkPoint2;

public class DepartamentoFiscal extends Departamento{

    private double impostos;
    private double faturamentoEmpresa;

    public DepartamentoFiscal(String nomeDepartamento, Integer idFuncionario, double custas, double impostos, double faturamentoEmpresa) {
        super(nomeDepartamento, idFuncionario, custas);
        this.impostos = impostos;
        this.faturamentoEmpresa = faturamentoEmpresa;
    }

    //Impostos devem ser em número decimal entre 0.1.. até 0.9..
    public void calculaGuias(){
        Double valorGuia = faturamentoEmpresa * impostos;
        System.out.println("\nO valor da sua guia é de: R$" + valorGuia);
    }

    @Override
    public double calcularCustas() {
        return this.getCustas() * (this.impostos/100);
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getFaturamentoEmpresa() {
        return faturamentoEmpresa;
    }

    public void setFaturamentoEmpresa(double faturamentoEmpresa) {
        this.faturamentoEmpresa = faturamentoEmpresa;
    }
}
