package com.aula19.exercicioGuiadoTema1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Particular paciente1 = new Particular(LocalDate.of(1998,05,12),"Joao", "Fioti", true,80.00,6079787545L);
        Publico paciente2 = new Publico(LocalDate.of(1960,02,13),"Maria", "Leao",true,23155);

        Consulta consulta1 = new Consulta(LocalDate.of(2022,2,3), "Ortopedista",13,00);
        Consulta consulta2 = new Consulta(LocalDate.of(2022,2,3), "Clinico Geral",20,30);

        paciente1.adicionarConsulta(consulta1);
        paciente2.adicionarConsulta(consulta2);

        paciente1.temQueAvaliar();
        paciente1.gerarRelatorioConsulta();


        paciente2.temQueAvaliar();
        paciente2.gerarRelatorioConsulta();

        paciente2.compareTo(paciente2);
    }
}
