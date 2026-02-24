package Assignments.Module_2;

class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Default";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class stud {

    public static void main(String[] args) {

        Student s1 = new Student();// Default constructor
        Student s2 = new Student("Pari", 21);// Parameterized constructor

        s1.display();
        System.out.println();
        s2.display();
    }
}
