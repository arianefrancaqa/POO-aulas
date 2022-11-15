package com.aula11.exercicioAula;

public class Poodle extends CachorroAula {

    public Poodle(String nome, int idade, Integer numeroPatas) {
        super(nome, idade, numeroPatas);
    }

    public Poodle(String nome) {
        super(nome);
    }

    //sobrescrita
    @Override
    public void latir(){
        System.out.println("Late como Poodle AU-AU");
    }
}
