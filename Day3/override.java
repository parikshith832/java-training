package Day3;

class animal3 {
    void sound() {
        System.out.println("animal makes a sound");
    }
}

class dog3 extends animal3 {
    void sound() {
        // super.sound();
        System.out.println("Dog barks");
    }
}

public class override {
    public static void main(String[] args) {
        animal3 ob = new dog3();// method overriding
        ob.sound();// dog barks
        animal3 ob1 = new animal3();
        ob1.sound();// animal makes a sound

    }
}
