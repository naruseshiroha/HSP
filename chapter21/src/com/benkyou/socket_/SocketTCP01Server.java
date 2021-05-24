package com.benkyou.socket_;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("wait joining");

        Socket socket = serverSocket.accept();

        System.out.println("socket=" + socket.getClass());

        InputStream is = socket.getInputStream();

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = is.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        is.close();
        socket.close();
        serverSocket.close();
        System.out.println("Server exited");
    }
}
