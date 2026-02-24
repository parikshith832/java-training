package Assignments.Module_3;

class animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class singleinh {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();// parent
        d.bark();// child
    }
}
