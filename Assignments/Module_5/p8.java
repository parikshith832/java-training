package Assignments.Module_5;

public class p8 {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        });

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start(): " + t.getState());

        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

        System.out.println("State during sleep: " + t.getState());
        try {
            t.join();
        } catch (Exception e) {
        }
        System.out.println("State during completion: " + t.getState());
    }
}
