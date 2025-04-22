public class StringConvert {
    public static void main(String[] args) {
        int n1 = 10;
        String str1 = n1 + "";
        System.out.println("str1:" + str1);

        int n2 = Integer.parseInt(str1);
        double n3 = Double.parseDouble(str1);
        System.out.println("n2:" + n2);
        System.out.println("n3:" + n3);

        char c = str1.charAt(0);
        System.out.println("c:" + c);

        String str2 = "hello";
        // "10"可以转成int "hello"不行
        // System.out.println(Integer.parseInt(str2));

    }
}