package Day5;

public class finallykey {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("execption: " + e);
            System.out.println("execption: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}