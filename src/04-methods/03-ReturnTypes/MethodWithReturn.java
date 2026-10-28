public class MethodWithReturn {

    static int getNumber() {
        return 100;
    }

    public static void main(String[] args) {
        int result = getNumber();

        System.out.println("Number = " + result);
    }
}