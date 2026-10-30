import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] first = {10, 20, 30};
        int[] second = {40, 50, 60};

        int[] merged = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            merged[first.length + i] = second[i];
        }

        System.out.println("Merged Array: "
                + Arrays.toString(merged));
    }
}