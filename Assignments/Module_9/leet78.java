package Assignments.Module_9;

import java.util.*;

class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            current.add(nums[i]);
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

public class leet78 {

    public static void main(String[] args) {

        Solution78 obj = new Solution78();

        int[] nums = { 1, 2, 3 };

        System.out.println(obj.subsets(nums));
    }
}