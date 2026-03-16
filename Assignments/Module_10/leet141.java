package Assignments.Module_10;

class Solution141 {

    public boolean hasCycle(ListNode head) {

        if (head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}

public class leet141 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head; // creating cycle

        Solution141 obj = new Solution141();

        System.out.println(obj.hasCycle(head));
    }
}