package com.borshcheva.webapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourcesReader {
    public String readResource(String webApp, String uri) throws IOException {

        FileReader file = new FileReader(webApp + "/" + uri);
        BufferedReader bufferReader = new BufferedReader(file);
        StringBuilder content = new StringBuilder(1024);
        String line;
        while ((line = bufferReader.readLine()) != null) {
            content.append(line);
        }
        return content.toString();
    }
}
