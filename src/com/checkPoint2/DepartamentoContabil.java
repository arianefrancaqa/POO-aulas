package com.checkPoint2;

public class DepartamentoContabil extends  Departamento{

     private double patrimonioLiquido;
     private  double passivoEmpresa;
     private double custasReceitaFederal;

    public DepartamentoContabil(String nomeDepartamento, Integer idFuncionario, double custas, double patromonioLiquido, double passivoEmpresa, double custasReceitaFederal) {
        super(nomeDepartamento, idFuncionario, custas);
        this.patrimonioLiquido = patromonioLiquido;
        this.passivoEmpresa = passivoEmpresa;
        this.custasReceitaFederal = custasReceitaFederal;
    }

    public void calcularAtivo(){
        Double calculaAtivo = passivoEmpresa + patrimonioLiquido;
        System.out.println("\nO cálculo do seu patrimonio líquido é de: R$ "+ calculaAtivo);
    }

    @Override
    public double calcularCustas() {
        return this.getCustas() + custasReceitaFederal ;
    }

    public double getPatromonioLiquido() {
        return patrimonioLiquido;
    }

    public void setPatromonioLiquido(double patromonioLiquido) {
        this.patrimonioLiquido = patromonioLiquido;
    }

    public double getPassivoEmpresa() {
        return passivoEmpresa;
    }

    public void setPassivoEmpresa(double passivoEmpresa) {
        this.passivoEmpresa = passivoEmpresa;
    }

    public double getCustasReceitaFederal() {
        return custasReceitaFederal;
    }

    public void setCustasReceitaFederal(double custasReceitaFederal) {
        this.custasReceitaFederal = custasReceitaFederal;
    }
}
