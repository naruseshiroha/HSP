package com.benkyou.socket_;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP01Client {
    public static void main(String[] args) throws Exception {
        // 1.
        //
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("socket = " + socket.getClass());
        // 2.
        //
        OutputStream os = socket.getOutputStream();
        // 3.
        os.write("hello,Server".getBytes(StandardCharsets.UTF_8));
        // 4.close
        os.close();
        socket.close();
        System.out.println("client exited");
    }
}
