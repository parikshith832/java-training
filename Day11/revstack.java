package Day11;

import java.util.*;

public class revstack {
    public static void main(String[] args) {
        String str = "meow";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }

    }
}
