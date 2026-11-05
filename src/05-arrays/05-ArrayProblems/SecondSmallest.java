public class SecondSmallest {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 40, 30};

        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (int number : numbers) {

            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } 
            else if (number < secondSmallest && number > smallest) {
                secondSmallest = number;
            }
        }

        if (secondSmallest == Long.MAX_VALUE) {
            System.out.println("Second smallest element does not exist.");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }
}