package com.benkyou.StringBuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        // 1.StringBuffer 的直接父类是 AbstractStringBuilder
        // 2.StringBuffer 实现了 Serializable,即 StringBuffer 的对象可串行化
        // 3.在父类中  有属性 byte[] value; 不是 final 修饰
        //   该 value 数组存放 字符串 内容,因此存放在堆中的
        // 4.StringBuffer 是一个 final 类,不能被继承
        // 5.因为 StringBuffer 字符内容是存在 byte[] value,所以在变化(增加/删除)
        //   不用每次都更换地址(即不是每次创建新对象),所以效率高于 String
        StringBuffer sb = new StringBuffer();
    }
}
