package Day5;

class MyThread extends Thread {
    public void run() {

    }
}

public class multiThrd {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
