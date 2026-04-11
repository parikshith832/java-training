package Day15;

import java.util.Arrays;

public class minplatform {
    static int findplatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0, platform = 1, maxplatform = 1;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platform++;
                i++;
            } else {
                platform--;
                j++;

            }
            maxplatform = Math.max(maxplatform, platform);

        }
        return maxplatform;

    }

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        int res = findplatform(arr, dep, n);
        System.out.println(res);
    }
}
