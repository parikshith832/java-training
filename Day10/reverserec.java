package Day10;

public class reverserec {
    static int rev(int n, int rev) {
        if (n <= 0) {

            return rev;
        }
        int d = n % 10;
        return rev(n / 10, rev * 10 + d);
    }

    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        System.out.println(rev(n, rev));

        int m = 065;
        System.out.println(m);
    }
}
