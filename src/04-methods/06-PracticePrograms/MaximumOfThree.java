public class MaximumOfThree {

    static int findMaximum(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        int c = 30;

        int result = findMaximum(a, b, c);

        System.out.println("Maximum Number = " + result);
    }
}