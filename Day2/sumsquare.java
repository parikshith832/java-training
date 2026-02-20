package Day2;

import java.util.*;

public class sumsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = n * n;
        int sum = 0;
        int temp = n;
        while (sqrt != 0) {
            sum += sqrt % 10;
            sqrt /= 10;
        }
        if (temp == sum)

            System.out.println(n + " is a neon no");
        else {
            System.out.println(n + " is not an neon no");
        }
    }

}
