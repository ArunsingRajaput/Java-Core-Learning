import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int number = sc.nextInt();
        int binary = 0;
        int base = 1;
        while (number > 0) {
            int remainder = number % 2;
            binary += remainder * base;
            base *= 10;
            number /= 2;
        }
        System.out.println("Binary: " + binary);
        sc.close();
    }
}