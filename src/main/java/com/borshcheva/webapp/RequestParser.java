package com.borshcheva.webapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringJoiner;

public class RequestParser {
    public Request parse(BufferedReader reader) throws IOException {
        Request request = new Request();
        String line = reader.readLine();
        String uri = null;
        String[] splitPath = line.split(" ");
        if (splitPath != null && splitPath.length > 0) {
            String method = splitPath[0];
            if (method.equals(HttpMethod.GET.toString())) {
                request.setMethod(HttpMethod.GET);
            } else {
                request.setMethod(HttpMethod.POST);
            }
            uri = splitPath[1];
            request.setUri(uri);
        }
        return request;
    }
}
