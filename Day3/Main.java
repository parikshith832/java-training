package Day3;

public class Main {
    public static void main(String[] args) {
        car ob = new car();
        ob.speed();
        ob.speed("eco");
        ob.speed(100);
    }
}

class vehical {
    void speed() {

        System.out.println("speed");
    }

    void speed(int maxspeed) {
        System.out.println("max speed is " + maxspeed);
    }
}

class car extends vehical {
    void speed(String mode) {

        System.out.println("mode is " + mode);

    }
}
