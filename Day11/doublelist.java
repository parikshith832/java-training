package Day11;

class Node12 {
    int data;
    Node12 next;
    Node12 prev;

    Node12(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doublelist {
    Node12 head;
    Node12 tail;

    void insert_at_end(int data) {
        Node12 newnode = new Node12(data);

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    void insert_at_first(int data) {
        Node12 newnode = new Node12(data);

        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    void delete_at_first() {
        if (head == null) {
            System.out.println("No elements present.");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    void delete_at_end() {
        if (head == null) {
            System.out.println("No elements present.");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    void display() {
        Node12 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        System.out.println("Doubly Linked List:");

        doublelist ob = new doublelist();

        ob.insert_at_end(10);
        ob.insert_at_end(20);
        ob.insert_at_end(30);
        ob.insert_at_end(40);
        ob.insert_at_first(50);

        ob.display();

        ob.delete_at_first();

        ob.display();

        ob.insert_at_first(60);
        ob.insert_at_end(70);

        ob.display();

        ob.delete_at_end();

        ob.display();
    }
}