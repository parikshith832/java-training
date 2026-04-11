package Day15;

public class dpbottomupmain {

    static int fib(int n) {

        // Step 1: Create DP array
        int dp[] = new int[n + 1];

        // Step 2: Base cases
        dp[0] = 0;
        dp[1] = 1;

        // Step 3: Build the solution from bottom (0 → n)
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Step 4: Return final answer
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 8;

        System.out.println(fib(n)); // Output: 21
    }
}
