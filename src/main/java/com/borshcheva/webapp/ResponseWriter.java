package com.borshcheva.webapp;

import java.io.BufferedWriter;
import java.io.IOException;

public class ResponseWriter {
    public void writeSuccessRepsonse(String content, BufferedWriter writer) throws IOException {

        writer.write("HTTP/1.1 200 OK");
        writer.newLine();
        writer.newLine();
        writer.write(content);

    }
}
