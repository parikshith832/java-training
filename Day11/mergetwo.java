package Day11;

class Listnode {
    int val;
    Listnode next;

    Listnode() {
    }

    Listnode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergetwo { // 21. Merge Two Sorted Lists

    public Listnode mergeTwoLists(Listnode list1, Listnode list2) {

        Listnode dummy = new Listnode();
        Listnode cur = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }

            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // Function to print list
    static void printList(Listnode head) {
        Listnode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        mergetwo obj = new mergetwo();

        // List1: 1 -> 3 -> 5
        Listnode list1 = new Listnode(1);
        list1.next = new Listnode(3);
        list1.next.next = new Listnode(5);

        // List2: 2 -> 4 -> 6
        Listnode list2 = new Listnode(2);
        list2.next = new Listnode(4);
        list2.next.next = new Listnode(6);

        Listnode result = obj.mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(result);
    }
}