package com.benkyou.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP03Server {
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        String s = bufferedReader.readLine();
        System.out.println(s);

        // 5.获取 socket 相关联的输出流
        OutputStream os = socket.getOutputStream();
        // 使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os));
        bufferedWriter.write("hello,client 字符流");
        // 插入一个换行符，表示回复内容的结束
        bufferedWriter.newLine();
        // 需要手动 flush
        bufferedWriter.flush();
        // 6.关闭流和 socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        System.out.println("Server exited");
    }
}
