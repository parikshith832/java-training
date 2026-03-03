package Assignments.Module_4;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}
