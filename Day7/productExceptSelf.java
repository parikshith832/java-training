package Day7;

import java.util.Arrays;

public class productExceptSelf {// 238. Product of Array Except Self
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        int answer[] = new int[n];

        int temp = 1;
        for (int i = 0; i < n; i++) {
            temp = 1;
            for (int j = 0; j < n; j++) {

                if (i != j) {
                    temp = temp * arr[j];
                }
            }
            answer[i] = temp;

        }
        System.out.println(Arrays.toString(answer));
    }
}
