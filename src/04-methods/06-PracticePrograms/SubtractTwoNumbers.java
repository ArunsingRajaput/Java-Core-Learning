public class SubtractTwoNumbers {

    static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 20;

        int result = subtract(num1, num2);

        System.out.println("Subtraction = " + result);
    }
}