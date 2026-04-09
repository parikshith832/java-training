package Day13;

//import java.util.Scanner;
import java.util.Stack;

public class leet277 {
    static int celeb(int nums[][], int n) {
        int ele = 0;
        for (int i = 1; i < n; i++) {
            if (nums[ele][i] == 1)
                ele = i;// i has potential to be the celebrity
        }
        for (int i = 0; i < n; i++) {
            if (i != ele)
                if (nums[ele][i] == 1 || nums[i][ele] == 0)
                    return -1;
        }
        return ele;
    }

    static int celebrity(int[][] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++)
            st.push(i);
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (nums[a][b] == 1) {
                st.push(b);

            } else
                st.push(a);
        }
        int ele = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != ele)
                if (nums[ele][i] == 1 || nums[i][ele] == 0)
                    return -1;
        }
        return ele;
    }

    public static void main(String[] args) {
        /*
         * System.out.println("enter the number of vertices: ");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int[][] nums = new int[n][n];
         * 
         * System.out.println("enter the matrix(0 or 1): ");
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n; j++) {
         * nums[i][j] = sc.nextInt();
         * }
         * }
         */
        int[][] num = { { 0, 1, 1 },
                { 0, 0, 1 },
                { 0, 0, 0 } };
        int n = num.length;

        int res = celeb(num, n);
        int result = celebrity(num);// using stack
        if (res == -1) {
            System.out.println("no celebrity");

        } else
            System.out.println("celebrity is at index " + res);

        if (result == -1) {
            System.out.println("no celebrity");

        } else
            System.out.println("celebrity is at index " + result);

    }
}