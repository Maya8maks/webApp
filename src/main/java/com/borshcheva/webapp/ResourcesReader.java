package com.borshcheva.webapp;

import java.io.*;

public class ResourcesReader {
    public String readResource(String webApp, String uri) throws IOException {
        File file = new File(webApp, uri);
        InputStream inputStream = new FileInputStream(file);
        int fileLength = (int)file.length();
        byte[] content = new byte[fileLength];
        inputStream.read(content);
        String result = new String(content);
        return result;

        }
}
