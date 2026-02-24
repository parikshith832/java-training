package Assignments.Module_1;

import java.util.*;

public class large3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no:");
        int a = sc.nextInt();

        System.out.println("enter the second no:");
        int b = sc.nextInt();
        System.out.println("enter the third no:");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }

}
