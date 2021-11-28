package com.borshcheva.webapp.exeptions;

public class MethodNotAllowedExeption extends RuntimeException{
    public MethodNotAllowedExeption(String message) {
        super(message);
    }

    public MethodNotAllowedExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
