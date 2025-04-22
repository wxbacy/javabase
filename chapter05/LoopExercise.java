public class LoopExercise {
    public static void main(String[] args) {
        System.out.println("for循环----------------------------------");
        for (int i = 0;i < 10; i++) {
            System.out.println(i + ":Hello World");
        }

        System.out.println("while循环----------------------------------");
        int i = 0;
        while (i < 10) {
            System.out.println(i + ":Hello World");
            i++;
        }

        System.out.println("do while循环----------------------------------");

        int j = 11;
        do {
            System.out.println(j + ":Hello World");
            j++;
        } while (j <= 10);
    }
}