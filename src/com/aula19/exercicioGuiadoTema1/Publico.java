package com.aula19.exercicioGuiadoTema1;

import java.time.LocalDate;

public class Publico extends Paciente implements Comparable<Publico>{

    private int numero;

    public Publico(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, int numero) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int
    compareTo(Publico o) {
        if (o.numero == this.numero) {
            System.out.println("\nNumero igual!");
            return 0;
        }else if (o.numero < this.numero){
            System.out.println("\nNumero menor");
            return -1;
        }else {
            System.out.println("\nNumero maior");
            return 1;
        }
    }
}
