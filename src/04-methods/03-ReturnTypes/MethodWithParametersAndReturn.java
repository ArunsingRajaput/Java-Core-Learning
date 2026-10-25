public class MethodWithParametersAndReturn {

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result = multiply(5, 6);

        System.out.println("Multiplication = " + result);
    }
}