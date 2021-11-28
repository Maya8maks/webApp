package com.borshcheva.webapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public int port;
    public String webApp;

    public int getPort() {
        return port;
    }

    public String getWebApp() {
        return webApp;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setWebApp(String webApp) {
        this.webApp = webApp;
    }

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            while (true) {
                try (
                        Socket socket = serverSocket.accept();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));) {
                    RequestHandler requestHandler = new RequestHandler(bufferedReader, bufferedWriter, webApp);
                    requestHandler.handle();
                }
            }
        }
    }


}
