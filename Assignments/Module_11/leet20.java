package Assignments.Module_11;

import java.util.*;

class Solution20 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (c == ')' && top != '(')
                    return false;
                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}

public class leet20 {

    public static void main(String[] args) {

        Solution20 obj = new Solution20();

        String s = "()[]{}";

        System.out.println(obj.isValid(s));
    }
}