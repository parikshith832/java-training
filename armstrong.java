import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int a = sc.nextInt();
        int Sum = 0;
        int temp = a;
        while (temp != 0) {
            temp /= 10;
            i++;
        }
        temp = a;

        int res = 0;
        while (temp != 0) {
            int n = (temp % 10);// n=4

            Sum += Math.pow(n, i);// pow=4**4

            temp /= 10;
        }
        System.out.println(Sum);
        if (Sum == a) {
            System.out.println("armstrong");

        } else {
            System.out.println("not");
        }
    }
}
