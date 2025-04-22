public class ArrayBase {
    public static void main(String[] args) {
        // 等价于 double hens[] = {1, 2.5, 3, 4, 44.2};
        // double[] hens = {1, 2.5, 3, 4, 44.2}; 静态初始化
        double[] hens = new double[5]; // 动态初始化
        hens[0] = 1;
        hens[1] = 2.5;
        hens[2] = 3;
        hens[3] = 4;
        hens[4] = 44.2;
        double sum = 0;
        for (int i = 0; i < hens.length; i++) {
            sum += hens[i];
        }
        System.out.println("sum=" + sum);

        // 数组创建后 如果没有赋值 默认元素是零值
        // int 0 long 0 byte 0 short 0
        // float 0.0 double 0.0
        // boolean false String null
        // char \u0000 空字符
        String[] strs = new String[4];
        for (int i = 0; i < strs.length; i++) {
            System.out.println("strs[" + i + "]=" + strs[i]);
        }

        char[] chars = new char[4];
        for (int i = 0; i < chars.length; i++) {
            System.out.println("strs[" + i + "]=" + chars[i]);
        }
    }
}