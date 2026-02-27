package Day5;

class MyThread extends Thread {
    public void run() {
        System.out.println("child thread");// occurs after main thread
        try {
            System.out.println("Sleeping");
            Thread.sleep(2000);
            System.out.println("Awake");
        } catch (Exception e) {

        }
    }
}

public class threads {
    public static void main(String[] args) {
        MyThread ob = new MyThread();
        ob.start();
        try {
            ob.join(); // this makes the main thread as second and child as first
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Main thread");// first this
    }

}