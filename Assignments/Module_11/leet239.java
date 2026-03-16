package Assignments.Module_11;

import java.util.*;

class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }

        return result;
    }
}

public class leet239 {

    public static void main(String[] args) {

        Solution239 obj = new Solution239();

        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };

        int k = 3;

        int result[] = obj.maxSlidingWindow(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}