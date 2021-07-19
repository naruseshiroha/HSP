package com.benkyou.set_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetSource {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("php");
        set.add("java");
        System.out.println(set);
        /*
        1.HashSet()
        public HashSet() {
            map = new HashMap<>();
        }
        2. boolean add(E e)
        public boolean add(E e) {
            return map.put(e, PRESENT)==null;
        }
        3. V put(K key, V value)
        public V put(K key, V value) {
            // private static final Object PRESENT = new Object();
            return putVal(hash(key), key, value, false, true);
        }
        hash(): return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        4. V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict)
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                       boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i; // 定义了辅助变量
            // table 就是 HashMap 的一个数组,类型是 Node<K,V>[] table
            // 如果 table 是 null, 或者 大小 == 0,第一次扩容,默认 16 个空间
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
            // 1).根据 key 得到 hash 去计算该 key 应该存放到 table 表的哪个索引位置,并把这个位置的对象,赋给p
            // 2).判断 p 是否为 null
            // (2.1).如果 p 为 null,表示还没有存放数据,就创建一个 Node(key="java",value=PRESENT)
            // (2.2).就放在该位置 tab[i] = newNode(hash, key, value, null)
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                // 开发技巧: 在需要局部变量(辅助变量)时候再创建
                Node<K,V> e; K k;
                // 如果当前索引位置对应的链表的第一个元素和准备添加的 key 的 hash 值一样
                // 并且满足
                //     1).准备加入的 key 和 p 指向的 Node 节点的 key 使用一个对象
                //     2).p 指向的 Node 节点的 key 的 equals() 和准备加入的 key 比较后相同
                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                // 在判断 p 是不是一棵红黑树
                // 如果是一棵红黑树,就调用 putTreeVal(),来进行添加
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else { // 如果 table 对应索引位置,已经是一个链表,就是用 for 循环比较
                    // 1).依次和该链表的每一个元素比较后,都不相同,则加入到该链表的最后
                    //    注意: 在把元素添加到链表后,立即判断 该链表是否已经达到 8 个节点
                    //        T: 调用 treeifyBin() 对当前这个链表进行树化(转成红黑树)
                    //    注意: 在转成红黑树时,要进行判断,判断条件
                    //        if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY) resize()
                    //        T: 先对 table 扩容;   F: 才将 链表 转成 红黑树
                    // 2).依次和该链表的每一个元素比较过程中,如果有相同情况,就直接 break
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD(8) - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            ++modCount;
            if (++size > threshold)
                resize();
            afterNodeInsertion(evict);
            return null;
        }
        */
    }
}
