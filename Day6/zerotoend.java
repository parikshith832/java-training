package Day6;

import java.util.Arrays;

public class zerotoend {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0 };
        int n = arr.length;
        int res[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                res[index++] = arr[i];
            }
        }
        while (index < n) {
            res[index++] = 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
