package com.benkyou.socket_;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP02Server {
    public static void main(String[] args) throws Exception {
        /*
         1.在本机 9999 端口监听,等待连接
             要求本机没有其它服务在监听 9999
             这个 ServerSocket 可以通过 accept() 返回多个  Socket[多个客户端服务器的并发]
         */
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("wait joining");
        /*
         2.当没有客户端连接 9999 端口是,程序会 阻塞,等待连接
            如果有客户端连接,则会返回 Socket 对象,程序继续
         */
        Socket socket = serverSocket.accept();
        System.out.println("socket=" + socket.getClass());
        // 3.通过 socket.getInputStream() 读取客户写入到数据通道的数据并显示
        InputStream is = socket.getInputStream();
        // 4.IO 读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = is.read(buf)) != -1) {
            // 根据读取到的实际长度,显示内容
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
