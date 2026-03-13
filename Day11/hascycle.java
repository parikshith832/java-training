package Day11;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class hascycle { // 141. Linked List Cycle

    boolean hasCycle(ListNode1 head) {

        ListNode1 slow = head;
        ListNode1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {

        hascycle obj = new hascycle();

        // Creating nodes
        ListNode1 head = new ListNode1(1);
        ListNode1 second = new ListNode1(2);
        ListNode1 third = new ListNode1(3);
        ListNode1 fourth = new ListNode1(4);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating a cycle (4 -> 2)
        fourth.next = second;

        boolean result = obj.hasCycle(head);

        if (result)
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }
}