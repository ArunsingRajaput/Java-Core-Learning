public class AlphabetPalindromePyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Increasing alphabets
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }

            // Decreasing alphabets
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }

            System.out.println();
        }
    }
}