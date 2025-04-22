public class ArrayReverse {
    public static void main(String[] args) {
        int[] nums1 = {11, 22, 33, 44, 55, 66};
        int[] nums2 = new int[nums1.length];
        for (int i = nums1.length; i >= 1; i--) {
            nums2[nums1.length - i] = nums1[i - 1];
        }
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}