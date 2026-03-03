package Assignments.Module_4;

final class FinalClass {
    final int value = 10; // final variable

    final void display() { // final method
        System.out.println("Value: " + value);
    }
}

public class p5 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();

        // obj.value = 20; Error
    }
}
