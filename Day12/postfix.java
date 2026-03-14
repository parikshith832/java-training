package Day12;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String str = "23*54*+9-";
        Stack<Integer> stack = new Stack<>();
        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    default:
                        System.out.println("invalid");
                        return;
                }

            }

        }
        System.out.println(stack.pop());
    }
}
