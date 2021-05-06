public class InterfacePolyPass {
    public static void main(String[] args) {
        // 接口类型的变量可以指向,实现了该接口的类的对象实例
        IG ig = new Teacher();
        // 如果 IG extends IH, Teacher implements IG => Teacher implements IH
        // 这就是所谓的多态传递现象
        IH ih = new Teacher();
    }
}

interface IH {
    void hi();
}

interface IG extends IH {
}

class Teacher implements IG {

    @Override
    public void hi() {
        // TODO Auto-generated method stub

    }
}