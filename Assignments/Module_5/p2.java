package Assignments.Module_5;

public class p2 {
    public static void main(String[] args) {

        try {

            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
