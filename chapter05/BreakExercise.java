import java.util.Scanner;

public class BreakExercise {
    public static void main(String[] args) {
        int counter = 0;
        int random;
        while (true) {
            counter++;
            random = (int)(Math.random() * 100) + 1;
            if (random == 97) {
                break;
            }
        }
        System.out.println("花费" + counter + "次随机到97");

        // 尽量不要使用标签
        label1:
        for (int i = 0; i < 2; i++) {
            label2:
            for (int j = 0; j < 2; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 1) {
                    System.out.println("发生break");
                    break label1;
                }
            }
        }
        System.out.println("over");

        // 有三次机会，如果输入用户名=丁真，密码=666，则提示登录成功，否则提示还有几次机会
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            username = scanner.next();
            System.out.println("请输入密码：");
            password = scanner.next();
            // 推荐常量字符串写在前面，可以避免空指针
            if ("丁真".equals(username) && "666".equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或密码错误，您还有" + (3 - i - 1) + "次机会");
            }
        }
    }
}