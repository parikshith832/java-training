package Assignments.Module_6;

public class p2 {// 2. Construct a Prefix Sum array and answer multiple range sum queries.
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int l = 1;
        int r = 3;
        int temp;
        if (l > 0) {
            temp = prefix[l - 1];
        } else
            temp = 0;

        int sum = prefix[r] - temp;
        System.out.println("Range Sum = " + sum);
    }
}
