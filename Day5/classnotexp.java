package Day5;

public class classnotexp {

    public static void main(String[] args) {
        try {
            Class.forName("classnot"); // Existing class
            System.out.println("Class found successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
    }
}