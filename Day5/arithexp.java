package Day5;

public class arithexp {
    class ageExecption extends Exception {
        ageExecption(String msg) {
            super(msg);
        }

    }

    static void checkAge(int Age) {
        if (Age < 18) {
            throw new ArithmeticException("not allowed");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("age is less (" + e + ")");

            System.out.println("execption: " + e.getMessage());
        }
    }
}
