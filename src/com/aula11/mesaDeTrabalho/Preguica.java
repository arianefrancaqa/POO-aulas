package com.aula11.mesaDeTrabalho;

public class Preguica extends Animal{
    private Boolean deveSubirEmArvores;

    public Preguica(String nome, int idade, Boolean deveEmitirSom, Boolean deveSubirEmArvores) {
        super(nome, idade, deveEmitirSom);
        this.deveSubirEmArvores = deveSubirEmArvores;
    }

    public void comer(){
        System.out.println("A preguiça "+getNome()+" se alimenta de plantas");
    }

    public void subirEmArvores(){
        if (deveSubirEmArvores == true){
            System.out.println("A preguiça "+getNome()+" deve subir em árvores");
        }
        else System.out.println("A preguiça "+getNome()+" não deve subir em árvores");
    }

    public Boolean getDeveSubirEmArvores() {
        return deveSubirEmArvores;
    }

    public void setDeveSubirEmArvores(Boolean deveSubirEmArvores) {
        this.deveSubirEmArvores = deveSubirEmArvores;
    }
}
