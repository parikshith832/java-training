package Day7;

public class kadanes {// 53. Maximum Subarray
    int withoutarr(int nums[]) {// without using arrays
        int curr = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(curr, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        int n = arr.length;

        int cur[] = new int[n];
        int maxi[] = new int[n];

        cur[0] = arr[0];
        maxi[0] = arr[0];

        for (int i = 1; i < n; i++) {
            cur[i] = Math.max(arr[i], cur[i - 1] + arr[i]);
            maxi[i] = Math.max(maxi[i - 1], cur[i]);
        }
        System.out.println("Maximum Sum = " + maxi[n - 1]);

    }
}
