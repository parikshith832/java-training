package Assignments.Module_10;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution206 {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode nextTemp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}

public class leet206 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Solution206 obj = new Solution206();
        ListNode result = obj.reverseList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}