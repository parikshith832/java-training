package Day5;

final class parent {

    parent() {
        final int x = 10;
        // x=1 error-> cant change the value it is constant

        System.out.println(x);
    }

    final void show(int x) {
        System.out.println("final method in class" + x);
    }
}

class parent1 {// class parent1 extends parent{} -> error
    final void show() {
        System.out.println("parent1 method in class");
    }
}

class child extends parent1 {
    void show(int x) {// void show() -> error no method overloading supported
        System.out.println("child method in class" + x);
    }
}

public class finaltype {
    public static void main(String[] args) {
        parent ob = new parent();
        child c = new child();

        ob.show(5);
        c.show();
        c.show(2);

        final int x = 1;
        System.out.println("main:" + x);
    }
}
