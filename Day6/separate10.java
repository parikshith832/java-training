package Day6;

import java.util.Arrays;

public class separate10 {// tcs

    void optimal(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                left++;
            }
        }
    }

    void separate(int[] num, int[] res) {
        int s = 0;
        int e = num.length - 1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {

                res[s] = num[i];
                s++;
            } else {
                res[e] = num[i];
                e--;
            }

        }
    }

    public static void main(String[] args) {
        separate10 ob = new separate10();
        int nums[] = { 1, 0, 1, 0, 1, 0 };

        int num[] = { 1, 0, 1, 0, 1, 0 };
        int res[] = new int[nums.length];
        ob.separate(nums, res);
        System.out.println(Arrays.toString(res));
        ob.optimal(num);
        System.out.println("optimal " + Arrays.toString(num));

        /*
         * int index=0;
         * for(int i=0;i<n;i++){
         * if (arr[i]==0){
         * res[index++]=arr[i];
         * }}
         * while(index<n){
         * res[index++]=1;
         * }
         */
    }
}
