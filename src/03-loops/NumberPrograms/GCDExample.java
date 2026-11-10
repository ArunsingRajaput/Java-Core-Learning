import java.util.Scanner;
public class GCDExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter secound number : ");
        int b = sc.nextInt();

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD: " + a);
    }
}

// public class GCDExample {

//     public static void main(String[] args) {

//         int a = 48;
//         int b = 18;
//         int n= a>b? b:a;
        
        // while (b != 0) {
        //     int remainder = a % b;
        //     a = b;
        //     b = remainder;
        // }
        // System.out.println("GCD: " + a);
        // for(int i=n/2;i>=1;i--){
        //     if(a%i==0 && b%i==0){
        //         System.out.println(i);
        //         break;
        //     }
        // }
//     }
// }