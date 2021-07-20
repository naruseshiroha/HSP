package com.benkyou.map_;

import java.util.HashMap;
import java.util.Map;

public class HashMapSource {
    public static void main(String[] args) {
        /*
        1).HashMap 底层维护了 Node 类型的数组 table,默认为 null
        2).当创建对象时,将加载因子(loadfactor)初始化为 0.75
        3).当添加 k-v 时,通过 key 的 hash 得到在 table 的索引.然后判断该索引处是否有元素,如果没有元素直接添加.
           如果该索引处铀元素,继续判断该元素的 key 和 准备加入的 key 是否相等,如果相等,则直接替换 value;
           如果不相等,需判断是树结构还是链表结构,做出相应处理.如添加时发现容量不够,则需要扩容.
        4).第一次添加,则需要扩容 table 容量为 16,临界值(threshold)为12[16*0.75]
        5).以后再扩容,则需要扩容 table 容量为原来的 2 倍,临界值也为原来的 2 倍,以此类推.
        6).在 java8 中,如果一条链表的元素个数超过 TREEIFY_THRESHOLD(8),并且 table 的大小
           >= MIN_TRTEEIFY_CAPACITY(64),就会进行树化(红黑树)
         */
        Map<String,Integer> map = new HashMap<>();
        map.put("java",10);
        map.put("php",30);
        map.put("java",20);
        System.out.println(map);
        /*
        1.new HashMap();
            public HashMap() {
                // DEFAULT_LOAD_FACTOR = 0.75;
                this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
            }
        HashMap$Node[] table = null;
        2.V put(K key, V value), return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }
        3.final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;
                // 如果底层的 table 数组为 null,或者 length == 0,就扩容到 16
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                // 取出 hash 值对应的 table 的索引位置的 Node,如果为 null,则直接把加入的 k-v
                // 创建成一个 Node,加入该位置即可
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    // 如果当前的 table 的已有的 Node 是红黑树,就按红黑树的方式处理
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {
                        // 如果找到的节点,后面是链表,就循环比较
                        for (int binCount = 0; ; ++binCount) { // 死循环
                            if ((e = p.next) == null) { // 如果整个链表,没有相同的,就加入到该链表的最后
                                p.next = newNode(hash, key, value, null);
                                // 加入后,判断当前链表的个数,是否已经到 8 个,到 8 个后就调用 treeifyBin 是否进行树化
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash && // 如果在循环比较过程中,发现有相同,就 break,就只是替换 value
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value; // 替换 key 对应的 value
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount; // 每增加一个 Node,就 ++size
                if (++size > threshold) // 如果 size > 临界值,扩容
                    resize();
                afterNodeInsertion(evict);
                return null;
            }

         4.关于树化(转成红黑树)
         //  如果 table 为 null,或者大小还没有到 64,暂时不树化,而是进行扩容
         // 否则才会真正的树化  ->  剪枝,小于 8 个节点的时候,会把 树 转换成 链表
         final void treeifyBin(Node<K,V>[] tab, int hash) {
            int n, index; Node<K,V> e;
            if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                resize();
         */
    }
}
