package Day7;

public class maxproduct {

    public static int maxProduct(int[] nums) {

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, -2, 4 };

        int ans = maxProduct(arr);

        System.out.println("Maximum Product Subarray: " + ans);
    }
}