package Day9;

import java.util.PriorityQueue;

public class kthlargest {// 215. kth largest element in an array
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            if (list.size() > k) {
                list.poll();

            }
        }

        System.out.println(list.peek());
        ;
    }
}
