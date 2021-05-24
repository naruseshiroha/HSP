package com.benkyou.socket_;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP02Server {
    public static void main(String[] args) throws Exception {
        // 1.监听
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("wait joining");
        // 2.连接
        Socket socket = serverSocket.accept();
        System.out.println("socket=" + socket.getClass());
        // 3.通过 socket.getInputStream() 读取客户写入到数据通道的数据并显示
        InputStream is = socket.getInputStream();
        // 4.IO 读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = is.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        // 5.获取 socket 相关联的输出流
        OutputStream os = socket.getOutputStream();
        os.write("hello,client".getBytes(StandardCharsets.UTF_8));
        // 设置结束标记
        socket.shutdownOutput();
        // 6.关闭流和 socket
        is.close();
        socket.close();
        serverSocket.close();
        System.out.println("Server exited");
    }
}
