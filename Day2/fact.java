package Day2;

public class fact {

    int factorial(int m) {
        int fact = 1;
        for (int i = 1; i <= m; i++) {
            fact *= i;
        }
        return fact;
    }

    boolean Strong(int d) {

        int temp = d;
        int sum = 0;

        while (temp != 0) {
            int n = temp % 10;
            sum += factorial(n);
            temp /= 10;
        }

        System.out.println("Sum of factorials = " + sum);

        if (sum == d)
            return true;

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        fact ob = new fact();

        if (ob.Strong(145)) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}