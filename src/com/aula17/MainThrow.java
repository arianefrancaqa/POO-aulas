package com.aula17;

public class MainThrow {
    public static void main(String[] args) {
        try {
            ExemploThrowsException data = new ExemploThrowsException(20,15,2005);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
