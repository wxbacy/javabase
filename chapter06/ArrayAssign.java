public class ArrayAssign {
    public static void main(String[] args) {
        // 一个变量赋值给另一个变量
        // 基本数据类型 是具体值拷贝 变量和值都保存在 栈 中
        // 引用数据类型 是地址拷贝（也叫引用赋值）变量和地址（值在 堆 中的内存地址）保存在 栈 中，值保存在 堆 中
        int n1 = 1;
        int n2 = n1;
        n2 = 2;
        System.out.println("n1=" + n1 + ",n2=" + n2); // n1=1,n2=2

        int[] nums1 = {1, 2, 3};
        int[] nums2 = nums1;
        nums2[1] = 10;
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " "); // 1 10 3
        }
        System.out.println();

        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " "); // 1 10 3
        }
        System.out.println();

        // 数组实现值拷贝
        int[] nums3 = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        nums3[2] = 44;
        System.out.println("nums3:");
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println("\nnum1:");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}