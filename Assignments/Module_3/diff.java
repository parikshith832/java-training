package Assignments.Module_3;

class parent {
    void show() {
        System.out.println("parent class");
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println((a + b + c));
    }
}

class child extends parent {
    void show() {
        // super.show();
        // System.out.println("we can use super. to call parent constructor:");
        System.out.println("child class");
    }
}

public class diff {
    public static void main(String[] args) {
        child ob = new child();
        ob.show();// overriding

        // overloading
        ob.add(10, 20);
        ob.add(10, 20, 30);
    }
}
