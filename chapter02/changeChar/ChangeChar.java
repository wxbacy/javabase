/**
 * 转义字符使用练习
 * @author chenwei
 * @version 1.0.0
 */
public class ChangeChar {
    public static void main(String[] args) {
        // 制表符
        System.out.println("制表符\t制表符");
        System.out.println("制表符:\\t");

        // 回车与换行
        System.out.println("韩顺平教育\r北京");
        System.out.println("韩顺平教育\n北京");

        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
    }
}