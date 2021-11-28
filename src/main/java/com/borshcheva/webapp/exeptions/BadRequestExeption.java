package com.borshcheva.webapp.exeptions;


public class BadRequestExeption extends RuntimeException{

    public BadRequestExeption(String message, Throwable cause) {
        super(message, cause);
    }

}
