import java.util.Scanner;

public class IfExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入马保国的信用分(1-100)：");
        int score = scanner.nextInt();

        // TODO::后面可以用异常处理 添加验证必须输入的是int

        if (score >= 1 && score <= 100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score > 60 && score <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("信用分必须是1-100以内");
        }
    }
}