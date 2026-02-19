public class palindrome {
    public static void main(String[] args) {
        int a = 1221;
        int d;
        int n = a;
        int rev = 0;
        while (n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);
        if (rev == a) {
            System.out.println("palindrome");

        } else {
            System.out.println("not palindrome");

        }
    }
}
