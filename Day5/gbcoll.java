package Day5;

public class gbcoll {
    static class Demo {
        Demo() {
            System.out.println("GB COllected");
        }
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1 = null;
        d2 = null;
        d1 = d2; // by default the null be stored as garbage collected
        System.gc();
        System.out.println("End of method as main");
    }
}
