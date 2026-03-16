package Assignments.Module_11;

import java.util.*;

class Solution150 {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}

public class leet150 {

    public static void main(String[] args) {

        Solution150 obj = new Solution150();

        String[] tokens = { "2", "1", "+", "3", "*" };

        System.out.println(obj.evalRPN(tokens));
    }
}