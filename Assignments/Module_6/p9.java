package Assignments.Module_6;

public class p9 {// 9. Find the missing number from an array containing numbers from 1 to n.
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int n = 5;
        int sum = n * (n + 1) / 2;
        int total = 0;
        for (int x : arr) {
            total += x;

        }
        System.out.println("Missing number: " + (sum - total));
    }
}
