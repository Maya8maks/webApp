package com.borshcheva.webapp;


public class BadRequestExeption extends RuntimeException{

    public BadRequestExeption(String message, Throwable cause) {
        super(message, cause);
    }

}
