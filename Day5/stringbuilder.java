package Day5;

import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.append("Java");
        System.out.println("After append: " + sb);
        sb.insert(1, "Java");
        System.out.println("After insert: " + sb);
        sb.replace(0, 5, "begin");
        System.out.println("After replace: " + sb);
        sb.delete(4, 8);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("string builder lenght: " + sb.length());// length
        if (sb.length() > 7) {

            System.out.println("charAt 8: " + sb.charAt(7));

        }
        if (sb.length() > 7) {
            sb.setCharAt(7, 'W');
            System.out.println("setCharAt 8 to W: " + sb);

        }
    }
}
