package Assignments.Module_8;

class Solution {

    public boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count characters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}

public class leet242 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "anagram";
        String t = "nagaram";

        boolean result = obj.isAnagram(s, t);

        if (result) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}