package Assignments.Module_9;

import java.util.*;

class Solution46 {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);

        return result;
    }

    void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {

            if (current.contains(num))
                continue;

            current.add(num);
            backtrack(nums, current, result);
            current.remove(current.size() - 1);
        }
    }
}

public class leet46 {

    public static void main(String[] args) {

        Solution46 obj = new Solution46();

        int[] nums = { 1, 2, 3 };

        System.out.println(obj.permute(nums));
    }
}