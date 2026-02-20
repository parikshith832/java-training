package Day1;

public class patterneasy {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\ndiagonal");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int i = 5;
        System.out.println("\n \n or\n");
        while (i != 0) {
            System.out.println("*****");

            i--;
        }
    }
}
