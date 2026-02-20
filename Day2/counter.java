package Day2;

public class counter {
    static int count = 0;
    int id;

    counter() {
        count++;
        id = count;
        System.out.println("object ID " + id);
    }

    public static void main(String args[]) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        System.out.println("total objects:" + count);
    }
}
