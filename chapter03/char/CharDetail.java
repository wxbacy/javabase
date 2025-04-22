public class CharDetail {
    public static void main(String[] args) {
        // char本质是一个整数，unicode编码表
        char c1 = '威';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println((int)c1 + 100);

        char c2 = 23041;
        System.out.println(c2);

    }
}