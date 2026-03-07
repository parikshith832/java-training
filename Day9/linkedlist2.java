package Day9;

import java.util.LinkedList;

public class linkedlist2 {

    static int size = 10;
    static LinkedList<Integer>[] table = new LinkedList[size];

    static void insert(int key) {
        int index = key % size;
        if (table[index] == null) {
            table[index] = new LinkedList<>();

        }
        table[index].add(key);
    }

    static void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + "--> ");
            if (table[i] != null) {
                for (int v : table[i]) {
                    System.out.print(v + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        display();
    }
}
