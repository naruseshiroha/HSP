package customgeneric;

public class CustomInterfaceGeneric {

}

/**
 * 泛型接口使用的说明
 * 
 * 1.接口中,静态成员不能使用泛型 2.泛型接口的类型,在继承接口或者实现接口时确定 
 */

// 没有指定类型,默认为 Object, 建议写成 IUSB<Object,Object>
// class IC implements IUSB {} // IUSB<Object,Object>

// 实现接口时,直接指定泛型接口的类型,给 U 指定 Integer, R 指定 Float
// class IB implements IUSB<Integer, Float> { }

// 在继承接口 指定泛型接口的类型
interface IA extends IUSB<String, Double> {

}

// 当我们去实现 IA 接口时,因为 IA 在继承 IUSB 接口时,制定了 U 为 String, R 为 Double,
// 在事项 IUSB 接口的方法时,使用 String 替换 U,Double 替换 R
class AA implements IA {

    @Override
    public Double get(String u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void hi(Double r) {
        // TODO Auto-generated method stub

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {
        // TODO Auto-generated method stub

    }

}

interface IUSB<U, R> {

    int n = 10;
    // U n = "";

    // 方法可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    // jdk8 可以在接口中,使用默认方法,也可以使用泛型
    default R method(U u) {
        return null;
    }
}
