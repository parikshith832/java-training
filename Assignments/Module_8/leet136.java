package Assignments.Module_8;

class Solution136 {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}

public class leet136 {

    public static void main(String[] args) {

        Solution136 obj = new Solution136();

        int[] nums = { 2, 2, 1 };

        System.out.println(obj.singleNumber(nums));
    }
}