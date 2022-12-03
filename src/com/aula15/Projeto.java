package com.aula15;

import java.time.LocalDate;

public class Projeto {

    private String endereco;
    private String dataInicio;
    private String dataTerminoPrevista;
    private String dataTerminoReal;
    private String numeroId;
    private String nomeCidadeProjeto;
    private String status;


    public Projeto(String endereco, String dataInicio, String dataTerminoPrevista, String dataTerminoReal,
                   String numeroId, String nomeCidadeProjeto, String status) {

        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.dataTerminoReal = dataTerminoReal;
        this.numeroId = numeroId;
        this.nomeCidadeProjeto = nomeCidadeProjeto;
        this.status = status;
    }

    public Boolean terminouNaData(){

        return LocalDate.parse(dataTerminoReal).equals(LocalDate.parse(dataTerminoPrevista)) && status == "terminado";

    }
}
