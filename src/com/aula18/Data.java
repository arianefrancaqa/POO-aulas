package com.aula18;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws DataException{
        if (dia < 1 || dia > 31 ){
            throw new DataException("Erro de dia");
        }

        if( mes < 1 || mes > 12){
            throw new DataException("Erro de mes");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
