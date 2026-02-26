package Day4;

import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String: ");
        String str = sc.nextLine();
        System.out.println("Length: " + str.length());
        System.out.println("uppercase: " + str.toUpperCase());
        System.out.println("lowercase: " + str.toLowerCase());
        if (str.length() > 0) {
            System.out.println("character at given index: " + str.charAt(1));
        }
        if (str.length() >= 3) {
            System.out.println("substring: " + str.substring(0, 3));
        }
        String str2 = "Java";
        System.out.println("Concat: " + str.concat(str2));
        System.out.println("using +: " + str + str2);
        System.out.println("equals: " + str.equals(str2));
        System.out.println("equals ignore case: " + str.equalsIgnoreCase(str2));
        System.out.println("Replace: " + str2.replace("Java", "C++"));
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Starts with: " + str.startsWith("J"));
        System.out.println("endsS with: " + str.endsWith("a"));
        System.out.println("Index of J:" + str.indexOf("J"));
        String words[] = str.split(" ");
        System.out.println("Split by Space:");
        for (String i : words) {
            System.out.println((i));
        }
        System.out.println("checking each one of the character: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                System.out.println(ch + " is a character");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit");
            } else {
                System.out.println(ch + " is a special character");
            }
        }
    }
}
