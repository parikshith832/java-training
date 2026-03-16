package Assignments.Module_8;

class Solution387 {

    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}

public class leet387 {

    public static void main(String[] args) {

        Solution387 obj = new Solution387();

        String s = "leetcode";

        System.out.println(obj.firstUniqChar(s));
    }
}