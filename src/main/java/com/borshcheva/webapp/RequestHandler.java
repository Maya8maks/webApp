package com.borshcheva.webapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class RequestHandler {

    private BufferedWriter writer;
    private BufferedReader reader;
    private String webApp;

    RequestHandler(BufferedReader reader, BufferedWriter writer, String webApp) {
        this.writer = writer;
        this.reader = reader;
        this.webApp = webApp;
    }

    public void handle() throws IOException {
        RequestParser requestParser = new RequestParser();
        Request request = requestParser.parse(reader);

        ResourcesReader resourcesReader = new ResourcesReader();
        String content = resourcesReader.readResource(webApp, request.getUri());

        ResponseWriter responseWriter = new ResponseWriter();
        responseWriter.writeSuccessRepsonse(content, writer);
    }

}
