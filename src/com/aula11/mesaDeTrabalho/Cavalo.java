package com.aula11.mesaDeTrabalho;

public class Cavalo extends Animal{
   private Boolean deveCorrer;

    public Cavalo(String nome, int idade, Boolean deveEmitirSom, Boolean deveCorrer) {
        super(nome, idade, deveEmitirSom);
        this.deveCorrer = deveCorrer;
    }

    public void comer(){
        System.out.println("O cavalo "+getNome()+" se alimenta de pasto");
    }

    public void correr(){
        if (deveCorrer == true){
            System.out.println("O cavalo "+getNome()+" deve correr");
        }
        else System.out.println("O cavalo "+getNome()+" não deve correr");
    }

    public Boolean getDeveCorrer() {
        return deveCorrer;
    }

    public void setDeveCorrer(Boolean deveCorrer) {
        this.deveCorrer = deveCorrer;
    }
}
