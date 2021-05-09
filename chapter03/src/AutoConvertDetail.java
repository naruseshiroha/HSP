public class AutoConvertDetail {
    public static void main(String[] args) {
        // 1.有多种类型的数据混合运算时,系统首先自动将所有数据类型转换成
        //   容量最大的那种数据类型,然后再进行计算
        int n1 = 10;
//        float f1 = n1 + 1.1; // double
        double d1 = n1 + 1.1;
        float f2 = n1 + 1.1F;

        // 2.当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时,
        //   就会报错,反之就会进行自动类型转换
//        int n2 = 1.1; // double -> int

        // 3.(byte,short) 和 char 之间不会相互自动转换,
        //   1).当把具体数赋给 byte 时,先判断是否在 byte 范围内,如果在范围内则可以
        //   2).如果是变量赋值,判断类型是否是 byte,如果是则可以
        byte b = 10;
        int n2 = 1;
//        byte b2 = n2;
//        char c1 = b; // byte 不能自动转成 char

        // 4.byte short char 它们三者可以计算,在计算时首先转换为 int 类型
        byte b2 = 127;
        short s2 = 32767;
//        byte b3 = b2 + s2; // Integer
//        short s3 = b2 + s2; // Integer
        int n3 = b2 + s2; // 32894
        char c2 = '洵'; // 27957
        System.out.println(b2 + s2 + c2); // 60851

        // boolean 不参与转换
        boolean flag = true;
//        int num = flag;

        // 自动提升原则:表达式结果的类型自动提升为操作数中最大的类型
        byte b3 = 1;
        short s3 = 2;
        int n5 = 3;
        float f3 = 4.5F;

//        float f5 = b3 + s3 + n5 + f3 + 1.0; // Double
        double f5 = b3 + s3 + n5 + f3 + 1.0;
    }
}
