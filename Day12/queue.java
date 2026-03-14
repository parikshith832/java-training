package Day12;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();// cant create the object of the queue, we need to implement linked list
                                              // as interface.
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
        System.out.println(q.peek());// top element in the queue
        System.out.println(q.isEmpty());
    }
}
