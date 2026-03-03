package Assignments.Module_5;

class MyThread extends Thread {// Using Thread class
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

class MyRunnable implements Runnable {// Using Runnable interface
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

public class p5 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
