package Day2;

public class employee {
    int id;
    String name;
    double salary;

    employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        employee ob = new employee(70, "Pari", 5000000);

        employee ob1 = new employee(20, "darshan", 5000000);
        ob.display();
        ob1.display();
    }

}
