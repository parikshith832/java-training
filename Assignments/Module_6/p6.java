package Assignments.Module_6;

public class p6 {// 6. Find the majority element using Boyer–Moore Voting Algorithm.
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int count = 0;
        int ele = 0;
        for (int i : arr) {
            if (count == 0)
                ele = i;

            if (i == ele)
                count++;
            else
                count--;
        }
        System.out.println("Majority Element: " + ele);
    }
}
