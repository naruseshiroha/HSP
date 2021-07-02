
import java.util.ArrayList;
import java.util.List;


public class GenericExtends {
    public static void main(String[] args) {

        // Object o = new String("xx"); // String -> Object

        // 泛型没有继承性
        // List<Object> list = new ArrayList<String>();

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        // printCollection2(list1);
        // printCollection2(list2); 
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1);
        // printCollection3(list2);
        printCollection3(list3);
        // printCollection3(list4);
        // printCollection3(list5);


    }

    public static void printCollection1(List<?> c) { // ? 支持任意泛型类型
        for (Object o : c) {
            System.out.println(o);
        }
    }

    // ? extends AA 表示上限,可以接受 AA 或者 AA 子类
    public static void printCollection2(List<? extends AA> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    // ? super 子类类名AA:支持 AA 类以及 AA 类的父类,不限于直接父类,规定了泛型的下限
    public static void printCollection3(List<? super AA> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
}

class AA {
}

class BB extends AA {
}

class CC extends BB {
}