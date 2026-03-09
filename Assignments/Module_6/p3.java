package Assignments.Module_6;

import java.util.Arrays;

public class p3 {// 3. Implement the Difference Array technique for range updates.
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int diff[] = new int[n];
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }
        int l = 1, r = 3, val = 5;
        diff[l] += val;
        if (r + 1 < n) {
            diff[r + 1] -= val;
        }
        int res[] = new int[n];
        res[0] = diff[0];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        System.out.println(Arrays.toString(res));
    }

}
