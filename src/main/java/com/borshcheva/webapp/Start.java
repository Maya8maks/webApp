package com.borshcheva.webapp;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.setPort(3000);
        server.setWebApp("src/main/resources");
        server.start();
    }

}
