public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(i + 'A');
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "\t");
        }
        System.out.println();

        int[] nums = {4, -1, 9, 10, 23};
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println("max=" + max + ",index=" + index);
    }
}