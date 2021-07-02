package generic;

@SuppressWarnings({"all"})
public class Generic03 {
    public static void main(String[] args) {
        // 泛型的作用是: 可以在类声明时通过一个标识表示类中某个属性的类型,或者是某个方法的返回值的类型,或者是参数类型

        Person<String> person = new Person<>("Linux");
        person.show();
        // class Person {
        //     String s; 
        
        //     public Person(String s) {
        //         this.s = s;
        //     }
        
        //     public String f() {
        //         return s;
        //     }
        // }

        Person<Integer> person2 = new Person<>(100);

    }
}

class Person<E> {
    // E 表示 s 的数据类型,该数据类型在定义 Person 对象的时候指定,即在编译期间,就确定 E 是什么类型
    E s; 

    // E 也可以是参数类型
    public Person(E s) {
        this.s = s;
    }

    // 返回类型使用 E
    public E f() {
        return s;
    }

    public void show(){
        System.out.println(s.getClass());
    }
}
