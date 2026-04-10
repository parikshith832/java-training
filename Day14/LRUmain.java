package Day14;

import java.util.*;

class LRUcache {
    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUcache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }

    private void insert(Node node) {
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;

    }

    public int get(int key) {
        if (!map.containsKey((key)))
            return -1;
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);

        }
        Node newNode = new Node(key, value);
        insert(newNode);
        map.put(key, newNode);

    }
}

public class LRUmain {
    public static void main(String[] args) {
        LRUcache cache = new LRUcache(2);
        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1));
        cache.put(3, 30);
        System.out.println(cache.get(2));

    }
}