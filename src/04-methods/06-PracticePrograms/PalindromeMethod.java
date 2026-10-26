public class PalindromeMethod {

    static boolean isPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        long reverse = 0;

        while (number > 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int number = 121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " is Not a Palindrome Number");
        }
    }
}