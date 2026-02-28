package Day6;

public class rotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int res[] = new int[n];
        int last = arr[0];
        for (int i = 0; i < n - 1; i++) {
            res[i] = arr[i + 1];
        }
        res[n - 1] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
