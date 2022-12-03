package com.checkPoint2;

public abstract class Departamento {

    private String nomeDepartamento;
    private Integer idFuncionario;
    private double custas;

    public Departamento() {}

    public Departamento(String nomeDepartamento, Integer idFuncionario, double custas) {
        this.nomeDepartamento = nomeDepartamento;
        this.idFuncionario = idFuncionario;
        this.custas = custas;
    }

    public abstract double calcularCustas();

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getCustas() {
        return custas;
    }

    public void setCustas(double custas) {
        this.custas = custas;
    }
}
