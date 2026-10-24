public class InvertedAlphabetPyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {

            char ch = (char) ('A' + i - 1);

            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print alphabets
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}