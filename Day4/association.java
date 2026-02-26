package Day4;

class teacher {
    String name;

    teacher(String name) {
        this.name = name;

    }

    void show() {
        System.out.println(name);
    }

}

class student1 {
    String name;

    student1(String name) {
        this.name = name;

    }

    void learn(teacher t) {
        System.out.println(name + " learns " + t.name);
    }
}

public class association {
    public static void main(String[] args) {
        student1 s = new student1("pari");
        teacher t = new teacher("mr.darsh");
        s.learn(t);
    }
}
