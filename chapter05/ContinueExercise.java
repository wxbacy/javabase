public class ContinueExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("i=" + i);
        }

        // 尽量不要使用标签
        label1:
        for (int i = 0; i < 2; i++) {
            label2:
            for (int j = 0; j < 2; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 1) {
                    System.out.println("发生continue");
                    continue label1;
                }
            }
        }
        System.out.println("over");
    }
}