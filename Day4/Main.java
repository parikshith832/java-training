package Day4;

abstract class student {
    int age;
    String name;

    student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    abstract void show();

}

class child extends student {
    int roll;

    child(String name, int age, int roll) {
        super(name, age);
        this.roll = roll;

    }

    void show() {
        System.out.println(name + " " + age + " " + roll);
    }
}

public class Main {
    public static void main(String[] args) {
        child ob = new child("pari", 21, 70);
        ob.show();
    }
}
