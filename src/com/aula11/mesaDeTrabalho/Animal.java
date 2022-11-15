package com.aula11.mesaDeTrabalho;

public abstract class Animal {
    private String nome;
    private int idade;
    private Boolean deveEmitirSom;

    public Animal(String nome, int idade, Boolean deveEmitirSom) {
        this.nome = nome;
        this.idade = idade;
        this.deveEmitirSom = deveEmitirSom;
    }

    public abstract void comer();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getDeveEmitirSom() {
        return deveEmitirSom;
    }

    public void setDeveEmitirSom(Boolean deveEmitirSom) {
        this.deveEmitirSom = deveEmitirSom;
    }
}
