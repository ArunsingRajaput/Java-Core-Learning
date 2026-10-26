public class DivideTwoNumbers {

    static double divide(double a, double b) {

        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return a / b;
    }

    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 4;

        double result = divide(num1, num2);

        System.out.println("Division = " + result);
    }
}