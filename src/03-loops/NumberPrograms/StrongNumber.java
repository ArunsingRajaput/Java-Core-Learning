import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            number /= 10;
        }
        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
        sc.close();
    }
}