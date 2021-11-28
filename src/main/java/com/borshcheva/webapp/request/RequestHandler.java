package com.borshcheva.webapp.request;

import com.borshcheva.webapp.Request;
import com.borshcheva.webapp.ResourcesReader;
import com.borshcheva.webapp.ResponseWriter;
import com.borshcheva.webapp.exeptions.BadRequestExeption;
import com.borshcheva.webapp.exeptions.ResourceNotFoundException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class RequestHandler {

    private BufferedWriter writer;
    private BufferedReader reader;
    private String webApp;

    public RequestHandler(BufferedReader reader, BufferedWriter writer, String webApp) {
        this.writer = writer;
        this.reader = reader;
        this.webApp = webApp;
    }

    public void handle() throws IOException {
        RequestParser requestParser = new RequestParser();
        ResourcesReader resourcesReader = new ResourcesReader();
        ResponseWriter responseWriter = new ResponseWriter();
        try {
            Request request = requestParser.parse(reader);
            String content = resourcesReader.readResource(webApp, request.getUri());
            responseWriter.writeSuccessRepsonse(content, writer);
        } catch (BadRequestExeption e) {
           responseWriter.writeBadRequset(writer);
        } catch(ResourceNotFoundException e) {
            responseWriter.writeNotFound(writer);
        }
    }

}
