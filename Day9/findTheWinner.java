package Day9;

import java.util.ArrayList;

public class findTheWinner {// 1823. Find the Winner of the Circular Game
    public int findTheWinner(int n, int k) {// optimal
        return solve(n, k) + 1;
    }

    public int solve(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (solve(n - 1, k) + k) % n;
    }

    static int find(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int cur = 0;
        while (arr.size() > 1) {
            int nxt = (cur + k - 1) % arr.size();
            arr.remove(nxt);
            cur = nxt;
        }
        return arr.get(0);
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(find(5, 2));
        findTheWinner ob = new findTheWinner();
        System.out.println(ob.findTheWinner(n, k));

    }
}
