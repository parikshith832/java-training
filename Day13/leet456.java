package Day13;

import java.util.Stack;

public class leet456 {
    static boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < second)
                return true;
            while (!st.empty() && nums[i] > st.peek()) {
                second = st.pop();

            }
            st.push(nums[i]);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 2 };
        if (find132pattern(nums)) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
