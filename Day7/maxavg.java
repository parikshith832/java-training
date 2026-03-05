package Day7;

public class maxavg {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int sum = 0;
        int n = arr.length;
        int k = 4;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k - 1) {
                max = Math.max(max, sum);
                sum -= arr[i - k + 1];
            }
        }
        double maxAvg = (double) max / k;
        System.out.println("Maximum Average: " + maxAvg);
    }
}
