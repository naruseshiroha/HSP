package com.benkyou.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\HSP\\chapter19\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据
        oos.writeInt(100); // int -> Integer(实现了 Serializable)
        oos.writeBoolean(false); // boolean -> Boolean(实现了 Serializable)
        oos.writeChar('a'); // 97, char -> Character(实现了 Serializable)
        oos.writeDouble(1); // 97, char -> Character(实现了 Serializable)
        oos.writeUTF("wo ai ni."); // String
        oos.writeObject(new Dog("WangCai", 3, "JP", "white")); // 对象需要实现 Serializable
        oos.close();
    }
}
