package Assignments.Module_9;

import java.util.*;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
    // See above tree diagram with parameters (left, right, s) for better
    // understanding
}

public class leet22 {

    public static void main(String[] args) {

        Solution22 obj = new Solution22();

        System.out.println(obj.generateParenthesis(3));
    }
}