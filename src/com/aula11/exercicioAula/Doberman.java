package com.aula11.exercicioAula;

public class Doberman extends CachorroAula {

    public Doberman(String nome, int idade, Integer numeroPatas) {
        super(nome, idade, numeroPatas);
    }

    public Doberman(String nome) {
        super(nome);
    }

    @Override
    public void latir() {
        System.out.println("Late como Doberman au-au-au");
    }

    public void morderComoDoberman(){
        System.out.println("Morde como Doberman au-au-au");
    }
}
