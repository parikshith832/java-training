package Day10;

public class recursioN {
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;

        }
        return n * fact(n - 1);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
        // return n%10+sum(n/10);
    }

    static int sum_digi(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }

    static void recu(int n) {

        System.out.print(n + " ");
        if (n > 0) {
            recu(n - 1);

        }

    }

    public static void main(String[] args) {
        int n = 5;
        recu(n);
        System.out.println();
        System.out.println("fact: " + fact(n));
        System.out.println("sum: " + sum(n));
        System.out.println("sum of digits: " + sum_digi(n));
    }
}