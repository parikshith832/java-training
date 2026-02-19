import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int d = 0;
        while (n != 0) { // 123!=0
            d = n % 10; // d=123%10 => 3
            rev = rev * 10 + d; // 0*10+3=3
            n = n / 10; // 123/10=12.3
        }
        System.out.println(rev);
    }
}
