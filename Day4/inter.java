package Day4;

interface Student {
    void show();

    default void Show() {
        System.out.println("default method");
    }

}

class Child implements Student {
    String name;
    int age;

    Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class inter {
    public static void main(String[] args) {
        Child s = new Child("Pari", 21);
        s.show();
        s.Show();
    }
}