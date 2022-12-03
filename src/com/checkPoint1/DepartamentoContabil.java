package com.checkPoint1;

public class DepartamentoContabil {

    private Integer idFuncionario;
    private Double patrimonioLiquido;
    private Double passivoEmpresa;

    public DepartamentoContabil(Integer idFuncionario, Double patrimonioLiquido, Double passivoEmpresa) {
        this.idFuncionario = idFuncionario;
        this.patrimonioLiquido = patrimonioLiquido;
        this.passivoEmpresa = passivoEmpresa;
    }

    public void calcularAtivo(){
        Double calculaAtivo = passivoEmpresa + patrimonioLiquido;
        System.out.println("\nO cálculo do seu patrimonio líquido é de: R$ "+ calculaAtivo+ " ----> Id Funcionário responsável pela emissão do Patrimonio Líquido: "+ idFuncionario +"\n");
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Double getPatrimonioLiquido() {
        return patrimonioLiquido;
    }

    public void setPatrimonioLiquido(Double patrimonioLiquido) {
        this.patrimonioLiquido = patrimonioLiquido;
    }

    public Double getPassivoEmpresa() {
        return passivoEmpresa;
    }

    public void setPassivoEmpresa(Double passivoEmpresa) {
        this.passivoEmpresa = passivoEmpresa;
    }
}
