public class StaticVariables {

    String name;

    static String college = "ABC College";

    public static void main(String[] args) {

        StaticVariables student1 = new StaticVariables();

        student1.name = "Arun";

        StaticVariables student2 = new StaticVariables();

        student2.name = "Rahul";

        System.out.println("Student 1: " + student1.name);

        System.out.println("College: " + StaticVariables.college);

        System.out.println("Student 2: " + student2.name);

        System.out.println("College: " + StaticVariables.college);
    }
}