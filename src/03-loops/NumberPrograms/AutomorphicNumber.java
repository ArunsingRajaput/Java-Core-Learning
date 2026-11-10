import java.util.Scanner;
public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int sq = n*n, temp = n;
        while(temp > 0){
            if(temp % 10 != sq % 10)
                break;
        temp /= 10;
        sq /= 10;
        }
        if(n >= 0 && temp == 0)
            System.out.println("Automorphic");
        else
            System.out.println("not Automerphic");
    }

    public static void main1(String[] args) {

        int number = 25;
        long square = (long) number * number;

        long temp = number;
        long divisor = 1;

        do {
            divisor *= 10;
            temp /= 10;
        } while (temp != 0);

        if (number >= 0 && square % divisor == number) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}