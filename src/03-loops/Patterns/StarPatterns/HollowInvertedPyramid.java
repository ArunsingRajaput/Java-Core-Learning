public class HollowInvertedPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            int total = 2*(n-i)+1;
            for (int j = 1; j <= total; j++) {
                if (i == 1 || j == 1 || j == total) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}