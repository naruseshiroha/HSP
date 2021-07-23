package com.benkyou.upload;

import com.benkyou.utils.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sora
 * @version 1.0.0
 * @package com.benkyou.upload
 * @date 2021/7/22 12:25 周四
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        // 1.服务端在本机监听 8888 端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server waiting join in 8888.");
        // 2.等待连接
        Socket socket = serverSocket.accept();
        // 3.读取客户端发送的数据,通过 Socket 得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 4.将得到的 bytes 数组,写入到指定的路径,得到一个文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\hc001.png"));
        bos.write(bytes);
        bos.close();

        // 5.向客户端回复收到,通过 Socket 得到字符输出流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片  over over.");
        writer.newLine();
        writer.flush();

        // 关闭其他他自愿
        bis.close();
        socket.close();
        serverSocket.close();

        System.out.println("server exit.");


    }
}
