package com.aula19.exercicioGuiadoTema1;

import java.time.LocalDate;

public class Particular extends Paciente{

    private double valorConsulta;
    private Long rg;

    public Particular(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, double valorConsulta, Long rg) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.valorConsulta = valorConsulta;
        this.rg = rg;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }
}
