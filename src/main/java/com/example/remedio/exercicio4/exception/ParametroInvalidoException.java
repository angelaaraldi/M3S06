package com.example.remedio.exercicio4.exception;

public class ParametroInvalidoException extends RuntimeException {
    public ParametroInvalidoException(String campo, String mensagem) {
        super("Campo " + campo + " é inválido: " + mensagem);
    }
}
