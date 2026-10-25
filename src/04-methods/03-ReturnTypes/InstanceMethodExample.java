public class InstanceMethodExample {

    void display() {
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {

        InstanceMethodExample obj = new InstanceMethodExample();

        obj.display();
    }
}