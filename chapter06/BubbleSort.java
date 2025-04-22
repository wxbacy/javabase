// 循环数组，通过每个元素与下一个元素的对比，如果大于下一个元素，则交换两个元素，每轮循环都把最大的数排到最后
// 每轮已经确定的最大数以及后面的数不再参与下一轮的比较
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {24, 69, 80, 57, 90};
        int loopTimes = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            loopTimes++;
            boolean hasExchange = false; 
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    hasExchange = true;
                }
            }
            if (!hasExchange) {
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        System.out.println("循环次数：" + loopTimes);
    }
}