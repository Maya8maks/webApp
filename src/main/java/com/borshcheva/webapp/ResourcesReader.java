package com.borshcheva.webapp;

import com.borshcheva.webapp.exeptions.ResourceNotFoundException;

import java.io.*;

public class ResourcesReader {
    public String readResource(String webApp, String uri) throws IOException {
        File file = new File(webApp, uri);
        try (InputStream inputStream = new FileInputStream(file);) {
            int fileLength = (int) file.length();
            byte[] content = new byte[fileLength];
            inputStream.read(content);
            String result = new String(content);
            return result;
        } catch (IOException e) {
            throw new ResourceNotFoundException("Cannot find resource", e);
        }

    }
}
