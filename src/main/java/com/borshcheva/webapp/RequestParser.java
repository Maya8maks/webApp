package com.borshcheva.webapp;

import java.io.BufferedReader;
import java.io.IOException;

public class RequestParser {
    public Request parse(BufferedReader reader){
        try {
            Request request = new Request();
            String line = reader.readLine();

            String[] splitPath = line.split(" ");
            if (splitPath != null && splitPath.length > 0) {
                String method = splitPath[0];
                if (method.equals(HttpMethod.GET.toString())) {
                    request.setMethod(HttpMethod.GET);
                } else {
                   throw new MethodNotAllowedExeption("Method not allowed");
                }
                String uri = splitPath[1];
                request.setUri(uri);
            }
            return request;
        } catch (IOException e) {
            throw new BadRequestExeption("Cannot parse request", e);
        }
    }
}
