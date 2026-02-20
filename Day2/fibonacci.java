package Day2;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 6;
        int temp;

        while (n > 0) {
            System.out.print(a + " ");
            temp = b;
            b = a + b;

            a = temp;
            n--;
        }

    }

}
