package com.benkyou.api_;

import java.net.InetAddress;

public class API_ {
    public static void main(String[] args) throws Exception {
        // 本机 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        // 根据指定主机名/域名获取 ip 地址对象 getByName
        InetAddress host2 = InetAddress.getByName("DESKTOP-KD18QTN");
        System.out.println(host2);
        InetAddress host3 = InetAddress.getByName("www.google.com");
        System.out.println(host3);

        // 获取 InetAddress 对象的主机名 getHostName
        String host3Name = host2.getHostName();
        System.out.println(host3Name);
        // 获取 InetAddress 对象的地址 getHostAddress
        String host3Address = host3.getHostAddress();
        System.out.println(host3Address);
    }
}
