package Day11;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class middlenode {// 876. Middle of the Linked List

    ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps
        }

        return slow;
    }

    public static void main(String[] args) {

        middlenode obj = new middlenode();

        // Creating Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = obj.middleNode(head);

        System.out.println("Middle Node: " + result.val);
    }
}
