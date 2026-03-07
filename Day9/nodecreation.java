package Day9;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class nodecreation {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        System.out.println(head.data);
        System.out.println(head.next.data);
    }
}
