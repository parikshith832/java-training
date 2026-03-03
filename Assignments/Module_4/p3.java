package Assignments.Module_4;

public class p3 {
    public static void main(String[] args) {
        // String (Immutable)
        String s1 = "Hello";
        String s2 = s1;
        s1 = s1 + " World";

        System.out.println("Are string 1 and string 2 same object? " + (s1 == s2));

        // StringBuilder (Mutable)
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1;

        sb1.append(" World");

        System.out.println("Are StringBuilder 1 and StringBuilder 2 same object? " + (sb1 == sb2));

        // StringBuffer (Mutable & Thread Safe)
        StringBuffer sf1 = new StringBuffer("Hello");
        StringBuffer sf2 = sf1;

        sf1.append(" World");

        System.out.println("Are StringBuffer 1 and StringBuffer 2 same object? " + (sf1 == sf2));
    }
}
