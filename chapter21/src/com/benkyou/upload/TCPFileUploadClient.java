package com.benkyou.upload;

import com.benkyou.utils.StreamUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author sora
 * @version 1.0.0
 * @package com.benkyou.upload
 * @date 2021/7/22 12:25 周四
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws  Exception {
        // 客户端连接服务端,得到 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        // 创建读取磁盘文件的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\hc01.png"));
        // bytes 就是 图片 对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        // 通过 Socket 获取到输出流, 通过 bytes 数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 将文件对应的字节数组的内容,写入到数据通道
        bos.write(bytes);
        bis.close();
        // 设置写入数据的结束标记
        socket.shutdownOutput();

        // 接收从服务端回复的消息
        String s = StreamUtils.streamToString(socket.getInputStream());
        System.out.println(s);

        bos.close();
        socket.close();
    }
}
