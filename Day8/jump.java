package Day8;

public class jump {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 12, 15 };
        int n = arr.length;// 5
        int k = 12;
        int step = (int) Math.sqrt(n);// 2
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < k) {// 2-1=1 4-1=3 exit
            prev = step;// 2 3
            step = step + (int) Math.sqrt(n);// 4 4+2=6
            if (prev >= n) {
                System.out.println("Element not found ");
                return;
            }

        }
        for (int i = prev; i < Math.min(step, n); i++) { // prev=3
            if (arr[i] == k) {// 12==12
                System.out.println("Element found in: " + i);// 3
            }
        }
    }
}
