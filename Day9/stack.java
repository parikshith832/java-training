package Day9;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.peek());
        list.pop();
        System.out.println(list);
    }
}
