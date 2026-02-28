package Day6;

import java.util.*;

public class twononrep {
    /*
     * given an array of lenght n your task is the print non repeating element from
     * the given array
     * condition : two non repeating elements one will be even and another will be
     * odd.
     */
    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 3, 4 };
        int res = 0;
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];// res=7
        }
        // Step 2: Get rightmost set bit
        int setBit = res & -res;// setbit=1

        int num1 = 0;
        int num2 = 0;

        for (int num : arr) {// Step 3: Divide numbers into two groups
            if ((num & setBit) != 0) {
                num1 ^= num;// odd element
            } else {
                num2 ^= num;// even element
            }
        }

        System.out.println("Non Repeating Elements:");
        System.out.println(num1 + " " + num2);
    }
}
