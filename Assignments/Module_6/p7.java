package Assignments.Module_6;

import java.util.Arrays;

public class p7 {// 7. Partition an array so that negative numbers appear before positives.
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, -5, 6 };
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            if (arr[l] < 0)
                l++;
            else if (arr[r] > 0)
                r--;
            else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
