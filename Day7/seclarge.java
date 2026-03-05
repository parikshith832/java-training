package Day7;

public class seclarge {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int max = Integer.MIN_VALUE;
        int prev = max;
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                prev = max;
                max = arr[i];
            } else if (arr[i] > prev && arr[i] < max) {// checks whether the previous of arr[i] is greater than the old
                                                       // previous value
                prev = arr[i];
            }

        }

        System.out.println("Second Largest: " + prev);
    }
}
