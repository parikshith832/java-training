package Assignments.Module_7;

import java.util.Arrays;

public class p5 {// 5 Implement Selection Sort and compare with Bubble Sort.
    public static void main(String[] args) {

        int arr[] = { 29, 10, 14, 37, 13 };

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
