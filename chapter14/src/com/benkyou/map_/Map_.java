package com.benkyou.map_;

import java.util.HashMap;
import java.util.Map;

/*
 * 1).Map 接口的常用实现类: HashMap Hashtable Properties
 * 2).HashMap 是 Map 接口使用频率最高的实现类
 * 3).HashMap 是以 K-V 键值对的方式来存储数据(HashMap$Node类型)
 * 4).key 不能重复,但是值可以重复,允许使用 null Key 和 null Value
 * 5).如果添加相同的 key,则会覆盖原来的 K-V,等同于修改.(key 不变,替换 value)
 * 6).与 HashSet 一样,不保证映射的顺序,因为底层是以 hash 表的方式来存储的(jdk8 的 hashMap 底层,数组 + 链表 + 红黑树)
 * 7).HashMap 没有实现同步,因此线程是不安全的,方法没有做同步互斥的操作. 没有 synchronized 修饰
 */
public class Map_ {
    public static void main(String[] args) {
        // 1.Map 与 Collection 并列存在.用于保存具有映射关系的数据: Key-Value(双列元素)
        // 2.Map 中的 key 和 value 可以是任何引用类型的数据,会封装到 HashMap$Node 对象中
        // 3.Map 中的 key 不匀速重复,原因和 HashSet 一样,新的 value 会替换 原来的 value
        // 4.Map 中的 value 可以重复
        // 5.Map 的 key 可以为 null,value 也可以为 null,key 为 null 只能有一个,value 为 null 可以有多个
        // 6.常用 String 类作为 Map 的 key
        // 7.key 和 value 之间存在单向一对一关系,即通过指定的 key 总能找到 唯一 与之对应的 value
        Map<Object, Object> map = new HashMap<>();
        map.put("no1", "zyy");
        map.put("no2", "llh");
        map.put("no1", "lxl");
        map.put("no3", "llh");
        map.put(null, null);
        map.put(null, "abc");
        map.put("no4", null);
        map.put(1,1);
        map.put(new Object(),2);

        Object no2 = map.get("no2");
        System.out.println(no2);

    }
}
