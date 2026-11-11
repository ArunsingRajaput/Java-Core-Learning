public class TribonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        int first = 0;
        int second = 1;
        int third = 1;
        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second + third;
            first = second;
            second = third;
            third = next;
        }
    }    
}
