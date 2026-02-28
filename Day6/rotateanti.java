package Day6;

public class rotateanti { // 189
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static void main(String[] args) {
        rotateanti ob = new rotateanti();
        int arr[] = { 1, 2, 3, 4, 5 };
        // ob.rotate(arr, 3);
        int n = arr.length;
        int res[] = new int[n];

        int k = 3;
        while (k != 0) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                res[i] = arr[i - 1];
            }
            res[0] = last;
            for (int i = 0; i < n; i++) {
                arr[i] = res[i];
            }
            k--;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
