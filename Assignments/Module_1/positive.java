package Assignments.Module_1;

import java.util.*;

public class positive {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a number");
        int num = ob.nextInt();
        if (num > 0) {
            System.out.println("Positive");

        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
