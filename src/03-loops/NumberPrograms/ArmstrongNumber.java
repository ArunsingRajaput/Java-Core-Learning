import java.util.Scanner;

public class ArmstrongNumber {
    public static void main1(String[] args) {
        int num = 153, temp = num, sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            System.out.println(digit);
            sum += digit * digit * digit;
            temp /= 10;
            
        }
        if(sum == num){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int temp = number, sum = 0, count = 0;
    
        while(temp > 0){
            count++;
            temp /= 10;
        }

        // do {
        //     count++;
        //     temp /= 10;
        // } while (temp != 0);

        temp = number;

        while (temp > 0) {

            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (number >= 0 && sum == number) {

            System.out.println("Armstrong Number");
        } else {

            System.out.println("Not Armstrong Number");
        }
    }
}