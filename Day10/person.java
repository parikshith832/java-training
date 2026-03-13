package Day10;

public class person {
    String name;
    int age;// instance variable

    public person(String name, int age /* local variable */) {
        this.name = name;
        this.age = age;

    }

    public String toString() {
        return "Name: " + name + " age: " + age;
    }
}
