package Day2;

import java.util.*;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int square = n * n;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println("Not Automorphic");
                return;
            }
            temp /= 10;
            square /= 10;
        }

        System.out.println("Automorphic");
    }
}