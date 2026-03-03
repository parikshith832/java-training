package Assignments.Module_5;

import java.io.*;

public class p1 {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: File not found");
        }

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: Division by zero");
        }
    }
}
