package Assignments.Module_2;

public class overloading {// method overloading
    static void calci(int a, int b) {// runs only with integer numbers ex:1,2,3... etc
        System.out.println(a + b);

    }

    static void calci(double a, double b) {// runs only with double number ex:0.1,10.2... etc
        System.out.println(a * b);

    }

    static int calci(int a, int b, int c) {
        return (a + b) / c;
    }

    public static void main(String[] args) {
        calci(5, 8);
        calci(10.9, 7.9);
        System.out.println(calci(3, 2, 5));
    }
}
