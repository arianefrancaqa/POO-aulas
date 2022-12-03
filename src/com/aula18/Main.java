package com.aula18;

public class Main {
    public static void main(String[] args) {
        try {
            Data data = new Data(32,12,2021);
        } catch (DataException e) {
            e.printStackTrace();
        }
    }
}
