package Assignments.Module_1;

import java.util.*;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("not Prime");
            return;

        }
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");

        } else {
            System.out.println("Not Prime");
        }
    }
}
