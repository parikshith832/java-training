package Day2;

public class constructor {
    String name;
    int age;

    /*
     * constructor(String a, int b) {
     * name = a;
     * age = b;
     * }
     * 
     */
    constructor() {
        System.out.println("default");
    }

    constructor(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        constructor ob = new constructor("Pari", 21);
        ob.display();
        // constructor def=new constructor();
        ob.name = "Parikshith";
        ob.display();
    }

}
