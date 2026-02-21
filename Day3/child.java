package Day3;

public class child extends parent {
    int x = 20;

    void print() {
        System.out.println("child");
    }

    void display() {
        super.print();// super class
        print();// child class
        System.out.println(x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        child ob = new child();
        ob.display();
    }
}
