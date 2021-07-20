package com.benkyou.map_;

import java.util.HashMap;
import java.util.Map;

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
