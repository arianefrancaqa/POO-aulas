package com.aula11.exercicioAula;

import com.aula11.mesaDeTrabalho.Cachorro;

public class Polimorfismo {
    public static void main(String[] args) {
        CachorroAula cachorroDoberman = new Doberman("DobermanScooby", 2,4);
        cachorroDoberman.latir();

        Object cachorroDoberman2 = new Doberman("DobermanScooby2", 2,4);
        ((Doberman) cachorroDoberman2).morderComoDoberman();


    }
}
