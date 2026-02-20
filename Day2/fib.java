package Day2;

public class fib {
    void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int fib = a + b;
            System.out.print(a + " ");
            a = b;
            b = fib;

        }

    }

    public static void main(String[] args) {
        fib ob = new fib();
        ob.fibonacci(6);
    }
}
