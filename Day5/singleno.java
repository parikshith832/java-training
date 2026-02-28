package Day5;

class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}

public class singleno {
    public static void main(String[] args) {
        Solution540 ob = new Solution540();
        int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(ob.singleNonDuplicate(nums));
    }
}
