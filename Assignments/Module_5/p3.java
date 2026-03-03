package Assignments.Module_5;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class p3 {

    static void checkNumber(int n) throws MyException {
        if (n < 0)
            throw new MyException(n + " Number cannot be negative");
        else
            System.out.println(n + "is Valid Number");
    }

    public static void main(String[] args) {
        try {
            checkNumber(5);
            checkNumber(-5);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}
