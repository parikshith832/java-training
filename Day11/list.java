package Day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class list {
    Node head;

    list() {
        head = null;
    }

    void insert_at_end(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;

    }

    void insert_at_first(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        list ob = new list();
        ob.insert_at_end(10);
        ob.insert_at_end(20);
        ob.insert_at_end(30);
        ob.insert_at_end(40);
        ob.insert_at_first(50);
        ob.insert_at_first(60);
        ob.insert_at_end(70);
        System.out.println("Linked List:");
        ob.display();

    }
}
