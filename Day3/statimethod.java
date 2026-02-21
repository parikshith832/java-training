package Day3;

class parent9 {
    static void show() {// this method runs first as its parent, so it calls first.
        System.out.println("Parent static Method");

    }
}

public class statimethod extends parent9 {
    static void show() {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        parent9 ob = new statimethod();
        ob.show();// parent static will override

    }
}
