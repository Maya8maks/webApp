package com.borshcheva.webapp.exeptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
