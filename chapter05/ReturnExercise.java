public class ReturnExercise {
    public static void main(String[] args) {
        // 尽量不要使用标签
        label1:
        for (int i = 0; i < 2; i++) {
            label2:
            for (int j = 0; j < 2; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 1) {
                    System.out.println("发生return");
                    return;
                }
            }
        }
        System.out.println("over");
    }
}