package com.aula15;

import java.time.LocalDate;

public class Casa extends Projeto{

    private int tamanhoTerreno;
    private int numeroBanheiros;
    private int numeroQuartos;


    public Casa(String endereco, String dataInicio, String dataTerminoPrevista, String dataTerminoReal,
                String numeroId, String nomeCidadeProjeto, String status, int tamanhoTerreno, int numeroBanheiros, int numeroQuartos) {
        super(endereco, dataInicio, dataTerminoPrevista, dataTerminoReal, numeroId, nomeCidadeProjeto, status);
        this.tamanhoTerreno = tamanhoTerreno;
        this.numeroBanheiros = numeroBanheiros;
        this.numeroQuartos = numeroQuartos;
    }

    @Override
    public String toString() {
        return "{" +
                "tamanhoTerreno=" + tamanhoTerreno +
                ", numeroBanheiros=" + numeroBanheiros +
                ", numeroQuartos=" + numeroQuartos +
                '}';
    }
}



