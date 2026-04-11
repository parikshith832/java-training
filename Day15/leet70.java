package Day15;

public class leet70 {

    // Function to calculate number of ways to climb stairs
    public static int climbStairs(int n) {

        // Base case: 0 or 1 step → only 1 way
        if (n <= 1)
            return 1;

        // DP array where dp[i] = ways to reach step i
        int dp[] = new int[n + 1];

        dp[0] = 1; // 1 way to stay at ground
        dp[1] = 1; // 1 way to reach step 1

        // Fill DP using Fibonacci logic
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // take 1 step or 2 steps
        }

        return dp[n]; // total ways to reach nth step
    }

    public static void main(String[] args) {

        int n = 5; // number of stairs

        int result = climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + result);
        // Output: 8
    }
}