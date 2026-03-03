package Assignments.Module_4;

class Counter {

    static int count = 0; // Static variable

    Counter() {
        count++;
    }

    static void showCount() { // Static method
        System.out.println("Total Objects Created: " + count);
    }
}

public class p6 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter.showCount();

        Counter c2 = new Counter();
        Counter.showCount();

        Counter c3 = new Counter();
        Counter.showCount();
    }

}
