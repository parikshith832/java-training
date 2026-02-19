import java.util.*;

public class strngno {
    public static void main(String[] args) {
        int a = 145;
        int temp = a;
        int Sum = 0;
        while (temp > 0) {
            int n = (temp % 10);
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            Sum += fact;
            temp /= 10;
        }
        System.out.println(Sum);
        if (Sum == a) {
            System.out.println("strong number");

        } else {
            System.out.println("not");
        }
    }
}
