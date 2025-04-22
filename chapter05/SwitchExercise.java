import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期几的代表字符(a-g):");
        char c = scanner.next().charAt(0);

        // switch中的数据类型只能是：byte,short,int,char,enum,String 其中之一
        // case 中的数据类型必须与switch中的数据类型一致，或者能自动转换成switch中的数据类型
        // case 中的值只能是常量（或者常量表达式），不能是变量
        switch(c) {
            case 'a':
                System.out.println("今天是星期一");
                break;
            case 'b':
                System.out.println("今天是星期二");
                break;
            case 'c':
                System.out.println("今天是星期三");
                break;
            case 'd':
                System.out.println("今天是星期四");
                break;
            case 'e':
                System.out.println("今天是星期五");
                break;
            case 'f':
                System.out.println("今天是星期六");
                break;
            case 'g':
                System.out.println("今天是星期天");
                break;
            default:
                System.out.println("您的输入不正确");
        }
    }
}