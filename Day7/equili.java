package Day7;

public class equili {// 724. Find Pivot Index

    public static void main(String[] args) {

        int arr[] = { 3, 4, 3, 1, 6 };
        int n = arr.length;
        int total = 0;
        int left = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        for (int i = 0; i < n; i++) {
            total -= arr[i];
            if (total == left) {
                System.out.println("equilibrium element in array is: " + arr[i]);
            } else
                left += arr[i];
        }
    }

}
