package Assignments.Module_4;

class Demo {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}

public class p7 {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj = null;
        System.gc();
        System.out.println("End of main");
    }
}
