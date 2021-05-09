public class StringToBasic {
    public static void main(String[] args) {
        // 基本数据类型 -> String
        int n = 1;
        float f = .125F;
        double d1 = .123;
        boolean b = false;
        String s1 = n + "";
        String s2 = f + "";
        String s3 = d1 + "";
        String s4 = b + "";
        System.out.printf("s1 %s s2 %s s3 %s s4 %s\n", s1, s2, s3, s4);

        // String -> 对应的基本数据类型
        String str = "123";
        int num = Integer.parseInt(str);
        double num2 = Double.parseDouble(str);
        float num3 = Float.parseFloat(str);
        long num4 = Long.parseLong(str);
        byte num5 = Byte.parseByte(str);
        boolean num6 = Boolean.parseBoolean(str);
        short num7 = Short.parseShort(str);
        System.out.printf("n1 %d n2 %.2f n3 %.2f n4 %d n5 %d n6 %s n7 %d ", num, num2, num3, num4, num5, num6, num7);

        // 怎么把字符串转成字符 char -> 指把字符串的第一个字符得到
        System.out.println(str.charAt(1)); // 2
    }
}
