package Day8;

public class indirectrec {
    static boolean isEven(int n) {
        if (n == 0)
            return true;
        return isOdd(n - 1);
    }

    static boolean isOdd(int n) {
        if (n == 0)
            return false;
        return isEven(n - 1);
    }

    public static void main(String[] args) {
        int x = 10;

        if (isEven(x))
            System.out.println(x + " is an even number");
        else
            System.out.println(x + " is an odd number");
    }
}
