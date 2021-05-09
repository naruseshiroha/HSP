public class CharDetail {
    public static void main(String[] args) {
        // 在 java 中,char 的本质是一个整数,在默认输出时,是 Unicode 码对应的字符
        // 要输出对应的数字,可以 (int)'a'
        char c1 = 97;
        System.out.println(c1); // a
        char c2 = 'a';
        System.out.println((int) c2); // 97
        char c3 = '洵';
        System.out.println((int) c3); // 27957
        char c4 = 26446;
        System.out.println(c4); // 李

        // char 类型是可以进行运算的,相当于一个整数,因为它都对应有 unicode 码
        System.out.println('a' + 103); // 200

        char c5 = 'b' + 1; // 99 c
        System.out.println((int) c5);
        System.out.println(c5);
    }
}
