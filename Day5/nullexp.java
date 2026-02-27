package Day5;

public class nullexp {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("We can have exception in this " + e);
        }
    }

}
