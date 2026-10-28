public class SwapNumbersMethod {

    static int[] swapNumbers(int a, int b) {

        int temp = a;

        a = b;

        b = temp;

        return new int[]{a, b};
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] result = swapNumbers(a, b);

        a = result[0];
        b = result[1];

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}