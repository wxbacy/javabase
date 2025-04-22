import java.util.Scanner;

public class ArrayAddElem {
    public static void main(String[] args) {
        int[] nums1 = {11, 22, 33, 44, 55, 66};
        Scanner scanner = new Scanner(System.in);
        int[] nums2;
        while(true) {
            System.out.println("是否要添加元素(y/n):");
            char isAddElem = scanner.next().charAt(0);
            boolean isEnd = false;
            switch(isAddElem) {
                case 'y':
                    System.out.println("请输入要添加的整数:");
                    int elem = scanner.nextInt();
                    nums2 = new int[nums1.length + 1];
                    for (int i = 0; i < nums1.length; i++) {
                        nums2[i] = nums1[i];
                    }
                    nums2[nums2.length - 1] = elem;
                    nums1 = nums2;
                    break;
                case 'n':
                    isEnd = true;
                    break;
                default:
                    System.out.println("您的输入不正确");
                    return;
            }
            if (isEnd) {
                break;
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}