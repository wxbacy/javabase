public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 静态初始化
        int[][] arr1 = {
            {1, 2, 3},
            {2, 3}
        };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 动态初始化

        
        int[][] arr2 = new int[2][3];
        arr2[0][1] = 10;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}