package com.benkyou.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

import org.junit.Test;

public class Homework03 {
    public static void main(String[] args) throws Exception {
        String filename = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(filename));
        // properties.list(System.out);
        String name = properties.getProperty("name");
        Integer age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        String datname = "src\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(datname));
        oos.writeObject(dog);
        oos.close();
    }

    @Test
    public void readDogdat() throws Exception {
        String datname = "D:\\HSP\\chapter19\\src\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datname));
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog);
        ois.close();
    }
}
