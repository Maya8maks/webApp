package com.borshcheva.webapp;

import java.io.IOException;

public class BadRequestExeption extends RuntimeException{

    public BadRequestExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BadRequestExeption(String message) {
        super(message);
    }
}
