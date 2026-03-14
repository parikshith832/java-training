package Day12;

import java.util.*;

public class maxelesub {

    public static void main(String[] args) {

        int arr[] = { 3, 8, 2, 5, 7, 6, 12 };
        int n = arr.length;
        int w = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> arr[b] - arr[a]);

        for (int i = 0; i < n; i++) {

            pq.offer(i);

            // Remove elements outside window
            while (pq.peek() <= i - w) {
                pq.poll();
            }

            // Start printing once window size reached
            if (i >= w - 1) {
                System.out.print(arr[pq.peek()] + " ");
            }
        }
    }
}