package com.aula15;

public class Departamento extends Projeto implements Comparable<Departamento>{

    private int numeroAndares;
    private int numeroAptPorAndar;

    public Departamento(String endereco, String dataInicio, String dataTerminoPrevista,
                        String dataTerminoReal, String numeroId, String nomeCidadeProjeto, String status, int numeroAndares, int numeroAptPorAndar) {
        super(endereco, dataInicio, dataTerminoPrevista, dataTerminoReal, numeroId, nomeCidadeProjeto, status);

        this.numeroAndares = numeroAndares;
        this.numeroAptPorAndar = numeroAptPorAndar;
    }


    public Boolean ehArranhaCeu(){
        return numeroAndares > 15;
    }

    public int tamanhoDepartamento(){

        return numeroAndares * numeroAptPorAndar;
    }

    @Override
    public int compareTo(Departamento o) {
        return  o.tamanhoDepartamento() - tamanhoDepartamento();
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "numeroAndares=" + numeroAndares +
                ", numeroAptPorAndar=" + numeroAptPorAndar +
                '}';
    }
}
