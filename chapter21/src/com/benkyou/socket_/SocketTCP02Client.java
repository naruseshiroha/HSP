package com.benkyou.socket_;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP02Client {
    public static void main(String[] args) throws Exception {
        // 1.连接服务器(ip 端口)
        // 连接本机的 9999 端口,如果连接成功,返回 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 2.连接上后,生成 Socket,通过 socket.getOutputStream() 得到和 socket 对象关联的输出流对象
        OutputStream os = socket.getOutputStream();
        // 3.通过输出流写入数据到 数据通道
        os.write("hello,Server".getBytes(StandardCharsets.UTF_8));
        // 设置结束标记
        socket.shutdownOutput();

        // 4.获取和 socket 关联的输入流.读取数据(字节),并显示
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
