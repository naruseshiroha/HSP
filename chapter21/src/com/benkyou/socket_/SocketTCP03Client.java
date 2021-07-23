package com.benkyou.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP03Client {
    public static void main(String[] args) throws Exception {
        // 1.连接服务器(ip 端口)
        // 连接本机的 9999 端口,如果连接成功,返回 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 2.连接上后,生成 Socket,通过 socket.getOutputStream() 得到和 socket 对象关联的输出流对象
        OutputStream os = socket.getOutputStream();
        // 3.通过输出流写入数据到 数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os));
        bufferedWriter.write("hello,server 字符流");
        bufferedWriter.newLine(); // 插入一个换行符号,表示写入的内容结束,要求对方使用 readLine() !!!
        bufferedWriter.flush(); // 如果使用的字符流,需要手动刷新,否则数据不会写入数据通道

        // 4.获取和 socket 关联的输入流.读取数据(字节),并显示
        InputStream is = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("Client exit");
    }
}
