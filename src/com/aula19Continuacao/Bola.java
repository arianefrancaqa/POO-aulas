package com.aula19Continuacao;

public class Bola extends Produto{

    private double raio;

    public Bola(double peso, double raio) {
        super(peso);
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        return 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
