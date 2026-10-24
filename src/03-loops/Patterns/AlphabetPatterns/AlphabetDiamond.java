public class AlphabetDiamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            char ch = (char) ('A' + i - 1);

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            char ch = (char) ('A' + i - 1);

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}