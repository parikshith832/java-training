package Day12;

import java.util.*;

class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    int pop() {
        if (q2.isEmpty()) {
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
        }
        return q2.poll();
    }
}

public class stackinqueue {
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
