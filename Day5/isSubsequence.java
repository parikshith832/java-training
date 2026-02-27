package Day5;

public class isSubsequence {
    boolean subsequence(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t
        // for (int j = 0; j < t.length() && i < s.length(); j++){
        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++; // move s pointer only when matched
            }

            j++; // always move t pointer
        }
        if (s.length() == i) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        isSubsequence ob = new isSubsequence();
        if (ob.subsequence(s, t)) {
            System.out.println("true");

        } else
            System.err.println("false");
    }
}
