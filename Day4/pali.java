package Day4;

public class pali {// leetcode: -125. Valid Palindrome
    public static void main(String[] args) {
        String s = "javaj";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);

        }
        if (s.equals(rev)) {
            System.out.println("palindrome " + rev);
        } else {
            System.out.println("not a palindrome " + rev);

        }
    }

}
