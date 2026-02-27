package Day5;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;

        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

public class validanagram {
    public static void main(String[] args) {
        Solution ob = new Solution();
        String s = "anagram";
        String t = "nagaram";
        if (ob.isAnagram(s, t)) {
            System.out.println(s + " and " + t + " is an anagram");
        } else {
            System.out.println(s + " and " + t + " is not an anagram");
        }

    }
}