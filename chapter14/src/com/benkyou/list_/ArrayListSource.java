package com.benkyou.list_;

import java.util.ArrayList;

public class ArrayListSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        // !!! IDEA 在默认情况下,Debug显示的数据是简化后的,如果希望看到完整的数据
        //     需要进行设置
        // transient Object[] elementData ,transient 修饰的属性不会被序列化
//        ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(8);
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add("tom");
        list.add("jack");
        list.add("smith");
        list.add("John");
    }
}
