package com.benkyou.socket_;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP02Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        OutputStream os = socket.getOutputStream();

        os.write("hello,Server".getBytes(StandardCharsets.UTF_8));
        // 设置结束标记
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = is.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //
        is.close();
        os.close();
        socket.close();
        System.out.println("Client exit");
    }
}
