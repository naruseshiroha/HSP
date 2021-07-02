package generic;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "all" })
public class GenericDetail {
    public static void main(String[] args) {
        // 1.给泛型指向数据类型时,只能是引用类型
        List<Integer> list = new ArrayList<>();
        // List<int> list = new ArrayList<>();

        // 2.在给泛型指定具体类型后,可以传入该类型或其子类型
        Pig<A> aPig = new Pig<>(new A());
        aPig.f();
        Pig<A> bPig = new Pig<>(new B());
        bPig.f();

        // 3.泛型的使用形式
        // 编译器会进行类型推断
        List<Pig<A>> pigs = new ArrayList<>();

        // 4.
        ArrayList arrayList = new ArrayList(); // ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(null); // add(Object o);
    }
}

class A {
}

class B extends A {
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}