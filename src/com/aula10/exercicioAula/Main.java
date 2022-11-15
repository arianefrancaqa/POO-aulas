package com.aula10.exercicioAula;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Roberto", 123456789L, 8.0);
        System.out.println(aluno.calcularIdade(LocalDate.of(1996,12,17)));

        Empregado empregado = new Empregado("Jonas",987456321L, 8500.00, 25.00);
        System.out.println(empregado.calcularIdade(LocalDate.of(2000, 06, 05)));

        empregado.calcularImc(10);

        System.out.println(empregado.calcularSalario(50.00,8.5));;
        System.out.println(empregado.calcularSalario(100.00));
    }
}
