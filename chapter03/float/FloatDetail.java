public class FloatDetail {
    public static void main(String[] args) {
        double num1 = 2.7;
        double num2 = 8.1 / 3;
        float num3 = 8.1f / 3;
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        // 以下都不相等
        if (num1 == num2) {
            System.out.println("equal num1 num2");
        }

        if (num1 == num3) {
            System.out.println("equal num1 num3");
        }

        // 对浮点数的运算结果进行判断，两个数的差值的绝对值，在某个足够小的范围内，就认为相等
        if (Math.abs(num1 - num2) < 0.000001) {
            System.out.println("real equal num1 num2");
        }

        if (Math.abs(num1 - num3) < 0.000001) {
            System.out.println("real equal num1 num3");
        }

        double num4 = 2.1;
        // 把小数赋值给浮点型时，后面必须加f或者F，
        // 因为java默认小数是double，double不能赋值给float，会有精度丢失
        float num5 = 2.1f;
        // 不相等
        if (num4 == num5) {
            System.out.println("equal num4 num5");
        }

        // 浮点型可以用科学计数法表示，如2.7e2 2.7*10^2
        // 2.7E2 2.7E-2
        double num6 = 2.7e2;
        System.out.println("num6:" + num6);
    }
}