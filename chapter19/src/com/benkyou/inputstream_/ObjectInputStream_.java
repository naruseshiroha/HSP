package com.benkyou.inputstream_;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.benkyou.outputstream_.Dog;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filePaht = "d:\\HSP\\chapter19\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePaht));
        // 1.读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);
        // System.out.println(ois.readObject());

        // 细节
        // 1.如果我们希望调用 Dog 的方法,需要向下转型
        // 2.需要我们将 Dog 类的定义,拷贝到可以引用的位置
        System.out.println(dog.getName());

        ois.close();
    }
}
