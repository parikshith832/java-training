package Assignments.Module_9;

import java.util.*;

class Solution39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    void backtrack(int[] arr, int target, int start, List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0)
            return;

        for (int i = start; i < arr.length; i++) {

            current.add(arr[i]);
            backtrack(arr, target - arr[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}

public class leet39 {

    public static void main(String[] args) {

        Solution39 obj = new Solution39();

        int[] nums = { 2, 3, 6, 7 };
        int target = 7;

        System.out.println(obj.combinationSum(nums, target));
    }
}