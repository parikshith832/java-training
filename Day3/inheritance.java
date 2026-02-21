package Day3;

public class inheritance {// hierarchical inheritance

    public static void main(String[] args) {
        cat ob = new cat();// single level inheritance
        puppy ob1 = new puppy();// multi level inheritance

        ob.print();
        ob.sound();

        ob1.print();
        ob1.barks();
        ob1.display();
    }
}
