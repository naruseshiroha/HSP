package com.benkyou.homework;

public class Homework07 {
    public static void main(String[] args) {
        /*
                    底层结构    版本      线程安全(同步),效率     扩容倍数
                                                           如果使用有参构造器,按照 1.5 倍扩容
         ArrayList  可变数组    jdk1.2   不安全,效率高        如果使用无参构造器,第一次 默认 10,
                                                           从第二次开始按照 1.5 倍扩容

                                                           如果使用有参构造器,按照 2 倍扩容
         Vector     可变数组    jdk1.0   安全,效率不高        如果使用无参构造器,第一次 默认 10,
                                                           从第二次开始按照 2 倍扩容
         */
    }
}
