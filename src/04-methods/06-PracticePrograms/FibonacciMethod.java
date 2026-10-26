public class FibonacciMethod {

    static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Fibonacci Series:");

        printFibonacci(n);
    }
}