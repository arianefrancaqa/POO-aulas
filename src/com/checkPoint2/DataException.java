package com.checkPoint2;

public class DataException extends Exception {

    public DataException() {
    }

    public DataException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Ocorreu um erro em "+ this.getClass().getName()+
                "\nMensagem: " + this.getMessage();
    }
}
