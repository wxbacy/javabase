public class ForceConvert{
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = (int)n1;
        System.out.println("n2:" + n2);

        long n3 = (long)n2;
        System.out.println("n3:" + n3);

        double n4 = 44.99;
        int n5 = (int)n4;
        System.out.println("n5:" + n5);

        int n6 = (int)(33.6 + 44.7);
        System.out.println("n6:" + n6);

        int n7 = 1892;
        byte n8 = (byte)n7;
        System.out.println("n8:" + n8);
    }
}