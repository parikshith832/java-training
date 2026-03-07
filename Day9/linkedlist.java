package Day9;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(30);
        list.addFirst(40);
        list.add(2, 50);
        System.out.println(list);
        list.remove(2);
        System.out.println("element at index 2: " + list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeLast();
        list.removeFirst();
        System.out.println("remove first and last " + list);
        System.out.println("size: " + list.size());

    }
}