package customgeneric;

@SuppressWarnings({"all"})
public class CustomGeneric {
    public static void main(String[] args) {
        BiJyou<Double,String,Integer> b = new BiJyou<>("john");
        b.setT(10.9);
        // b.setT("benkyou");
        System.out.println(b);
        BiJyou b2 = new BiJyou("john~~");
        b2.setT("benkyou"); // <Object,Object,Object>
        System.out.println(b2);
    }
}

/*
 * 1. BiJyou 后接泛型,所以我们就把 BiJyou 称为自定义泛型类 2. T, R, M 泛型的标识符,一般是单个大写字母
 * 3.泛型标识符可以有多个 4.普通成员可以使用泛型(属性,方法) 5.使用泛型的数组,不能初始化 6.静态方法中不能使用类的泛型
 */
class BiJyou<T, R, M> {
    String name;
    T t;
    R r;
    M m;

    // 因为数组在 new 不确定 T 的类型,就无法在内存开空间
    // T[] ts = new T[8];

    // 因为静态是和类相关的,在类加载时,对象还没有创建,所以,如果静态方法和静态属性使用了泛型,JVM就无法完成初始化
    // static R r2;

    // public static void m1(M m) {
    // }

    public BiJyou(String name) {
        this.name = name;

    }

    public BiJyou(T t, R r, M m) {
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public BiJyou(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return this.r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return this.m;
    }

    public void setM(M m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", t='" + getT() + "'" +
            ", r='" + getR() + "'" +
            ", m='" + getM() + "'" +
            "}";
    }

}
