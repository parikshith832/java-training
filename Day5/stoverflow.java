package Day5;

public class stoverflow {
    static void recursive() {
        recursive();
    }

    public static void main(String[] args) {
        try {
            recursive();
        } catch (StackOverflowError e) {
            System.out.println("we are getting over size " + e);
        }
    }
}
