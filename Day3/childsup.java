package Day3;

class parent1 {
    parent1() {
        System.out.println("parent");
    }

}

public class childsup extends parent1 {
    childsup() {
        super();
        System.out.println("child");
    }

    public static void main(String[] args) {
        childsup ob = new childsup();

    }

}
