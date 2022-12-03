package com.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExceptionsBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, divisao;

        try {
            System.out.println("Primeiro número: ");
            num1 = scanner.nextInt();

            System.out.println("Segundo número: ");
            num2 = scanner.nextInt();

            divisao = num1/num2;
            System.out.println("Resultado divisao: "+ divisao);
        }catch (InputMismatchException e) {
            System.err.println("Erro na entrada de dados, digite um valor inteiro!     " + e);

        }
        catch (ArithmeticException e) {
            System.err.println("Erro. Impossivel divisão por 0!     " + e);

        }catch (Exception e){
            e.printStackTrace();
        }


        //divisao por 0

        //digitar uma string ao invés int
    }
}
