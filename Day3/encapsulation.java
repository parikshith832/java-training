package Day3;

public class encapsulation {
    public static void main(String[] args) {

        student10 ob = new student10("Pari", 21);
        System.out.println(ob.getname());
        ob.setname("Parikshith");
        System.out.println(ob.getname());
    }
}
