package com.aula18;

public class DataException extends Exception {
    //por padrao se cria um construtor padrão para garantir que todas as exceções

    public DataException() {
    }

    public DataException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "A exceção ocorreu em "+ this.getClass().getName()+
                "\nMensagem: " + this.getMessage();
    }
}
