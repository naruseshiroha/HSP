public class ForceConvertDetail {
    public static void main(String[] args) {
        // 强转符号只针对于最近的操作数有效,往往会使用小括号提升优先级
//        int x = (int) 10 * 3.5 + 6 * 1.5; // double -> int
        int x = (int) (10 * 3.5 + 6 * 1.5); // 44

        char c1 = 123;
        int n = 234;
//        char c = n;
        char c2 = (char) n;
        System.out.println(c2);
    }
}
