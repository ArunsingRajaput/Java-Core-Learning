public class LCMExample {

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int lcm = Math.max(a, b);

        while (true) {

            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }

            lcm++;
        }

        System.out.println("LCM: " + lcm);
    }
}