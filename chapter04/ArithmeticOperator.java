public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10 / 4);
        double d = 10 / 4;
        System.out.println(d);

        System.out.println(10 / 3);
        System.out.println(-10 / 3);
        System.out.println(10 / -3);
        System.out.println(-10 / -3);
        
        // a % b 的本质是 a - a / b * b
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);

        int i = 1;
        i = i++;
        // 这里会输出i为1。 i = i++;计算过程：temp = i; i = i + 1; i = temp
        // 实际使用中不要写这种不清晰的代码
        System.out.println(i);

        // 假如还有59天放假 问还有多少个星期 多少天
        System.out.println("假如还有59天放假 还有" + 59 / 7 + "个星期，" + 59 % 7 + "天");

    }
}