package com.aula17;

public class ExemploThrowsException {
    private int dia;
    private int mes;
    private int ano;

    // throws é responsável por obrigar quem chamar o contrutor a usar o try catch
    public ExemploThrowsException(int dia, int mes, int ano) throws Exception{
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12){
            throw new Exception("Os valores são inválidos");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
