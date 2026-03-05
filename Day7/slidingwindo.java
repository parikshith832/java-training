package Day7;

public class slidingwindo {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 2, 5, 7, 6, 12 };
        int n = arr.length;
        int w = 4;
        int cur = 0;
        for (int i = 0; i < w; i++) {// calculates the first set of sum
            cur = cur + arr[i];
        }
        int max = cur;
        System.out.print(cur + " ");
        for (int i = 1; i <= n - w; i++) {// calculates the sum after first set
            cur = cur - arr[i - 1] + arr[i + w - 1];
            if (max < cur) {
                max = cur;
            }
            System.out.print(cur + " ");

        }
        System.out.println("maximum is: " + max);

    }

}
