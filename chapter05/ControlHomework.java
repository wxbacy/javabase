public class ControlHomework {
    public static void main(String[] args) {
        // 1. 张三有100000元，每经过一次路口，需要缴费
        // 当余额大于50000时，每次交5%
        // 当余额小于等于50000时，每次交1000
        // 计算张三能经过几次路口，用while break方式实现

        double balance = 100000;
        int counter = 0;
        while(true) {
            if (balance > 50000) {
                balance -= balance * 0.05;
            } else {
                balance -= 1000;
            }
            if (balance >= 0) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println("张三能经过" + counter + "次路口");

        // 输出1-100中不能被5整除的数，每五个一行
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                j++;
                System.out.print(i + "\t");
            }
            if (j == 5) {
                System.out.println();
                j = 0;
            }
        }

        // 输出小写的a~z以及大写的Z~A
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // 求出 1/1 - 1/2 + 1/3 - 1/4 ... 1/100 的结果
        double sum = 0;
        for (double i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += 1 / i;
            } else {
                sum -= 1 / i;
            }
        }
        System.out.println("结果是：" + sum);

        // 求出 1 + （1 + 2） + （1 + 2 + 3）+ ... + (1 + 2 + 3 + ... + 100)
        int totalSum = 0;
        for (int i = 1; i <= 100; i++) {
            int subSum = 0;
            for (int m = 1; m <= i; m++) {
                subSum += m;
            }
            totalSum += subSum;
        }
        System.out.println("结果是：" + totalSum);
    }
}