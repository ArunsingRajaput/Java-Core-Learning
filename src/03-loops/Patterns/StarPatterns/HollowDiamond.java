public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int total = 2*i-1;
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= total; j++) {
                // if (j == 1 || j == total) { 
                //     System.out.print("* ");
                // } else {
                //     System.out.print("  ");
                // }
                System.out.print(j==1 || j==total ? "* " : "  ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            int total = 2*i-1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= total; j++) {
                // if ( j == 1 || j == total) {
                //     System.out.print("* ");
                // } else {
                //     System.out.print("  ");
                // }
                System.out.print(j==1|| j==total ? "* " : "  ");
            }
            System.out.println();
        }
    }
}