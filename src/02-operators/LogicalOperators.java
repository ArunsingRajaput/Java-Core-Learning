public class LogicalOperators {

    public static void main(String[] args) {

        int age = 21;
        int marks = 85;

        System.out.println(age >= 18 && marks >= 50);

        System.out.println(age >= 18 || marks >= 90);

        System.out.println(!(age >= 18));
    }
}