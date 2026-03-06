package Day8;

public class mySqrt {
    public static void main(String[] args) {
        int x = 4;
        if (x < 1) {
            System.out.println("invalid");
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                System.out.println(mid);
                break;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }
}
