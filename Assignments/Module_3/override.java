package Assignments.Module_3;

class shape {
    void draw() {
        System.out.println(" shape");
    }
}

class circle extends shape {
    void draw() {
        System.out.println("circle");
    }
}

class rectangle extends shape {
    void draw() {
        System.out.println("rectangle");
    }
}

public class override {
    public static void main(String[] args) {
        shape s = new circle();
        s.draw();
        shape s1 = new rectangle();
        s1.draw();
    }
}
