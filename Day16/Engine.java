package Day16;

/**
 * spring1
 */
public class Engine {

    public void start() {
        System.out.println("Engine Started");

    }
}

class car {
    private Engine engine = new Engine();

    public void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

/**
 * InnerEngine
 */
public class InnerEngine {
    public static void main(String[] args) {

        Engine engine = new Engine();
        car = new car(engine);
        /*
         * spring-> spring creates object and it will manage lifecycle
         * IOC-> inversion of control
         * ->control of object creation moves from program to spring
         * DI-> Dependancy injection
         * instead of creating dependency on your spring automatically injects it
         */
    }
}
