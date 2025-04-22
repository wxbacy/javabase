public class AutoConvert {
    public static void main(String[] args) {
        // 自动类型转换：精度小的自动转换成精度大的数据类型
        // byte short int long float double
        //      char

        // byte short char之间或者自己与自己计算时都会转成int计算
        // 1.cpu对int计算效率高 2.避免复杂的类型转换
        byte b = 2;
        byte b2 = 3;
        // 错误 结果是int
        // byte b3 = b + b2; 
        int i = b + b2;

        boolean bo = true;
        // 错误 boolean不能进行转换
        // int i2 = (int)bo;

    }
}