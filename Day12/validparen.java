package Day12;

import java.util.Stack;

public class validparen {// 20. Valid Parentheses
    static boolean validparentheses(String str) {
        Stack<Character> stack = new Stack<>();
        /*
         * for (int i = 0; i < str.length(); i++) {
         * char ch = str.charAt(i);
         */
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[')
                        || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(validparentheses(str));
        String str1 = "()[]{}";
        System.out.println(validparentheses(str1));
        String str2 = "(]";
        System.out.println(validparentheses(str2));
        String str3 = "([)]";
        System.out.println(validparentheses(str3));

    }

}
