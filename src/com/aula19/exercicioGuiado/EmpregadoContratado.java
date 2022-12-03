package com.aula19.exercicioGuiado;

public class EmpregadoContratado extends Empregado{

    private double valorPorHora;
    private double imposto;

    public EmpregadoContratado(){} //exemplo sem parametro

    public EmpregadoContratado(String nome, String sobrenome, String arquivo, double valorPorHora, double imposto) {
        super(nome, sobrenome, arquivo);
        this.valorPorHora = valorPorHora;
        this.imposto = imposto;
    }

    @Override
    public double calcularSalario(int dias) {
        double valorTotal = (this.valorPorHora * 8) * dias;
        return valorTotal - (valorTotal * (this.imposto/100));
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}