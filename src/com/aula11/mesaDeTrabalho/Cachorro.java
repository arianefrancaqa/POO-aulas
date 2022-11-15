package com.aula11.mesaDeTrabalho;

public class Cachorro extends Animal{

    private Boolean deveCorrer;

    public Cachorro(String nome, int idade, Boolean deveEmitirSom, Boolean deveCorrer) {
        super(nome, idade, deveEmitirSom);
        this.deveCorrer = deveCorrer;
    }

    public void comer(){
        System.out.println("O cachorro "+getNome()+" se alimenta de ração");
    }

    public void correr(){
        if (deveCorrer == true){
            System.out.println("O cachorro "+getNome()+" deve correr");
        }
        else System.out.println("O cachorro "+getNome()+" não deve correr");
    }

    public Boolean getDeveCorrer() {
        return deveCorrer;
    }

    public void setDeveCorrer(Boolean deveCorrer) {
        this.deveCorrer = deveCorrer;
    }
}
