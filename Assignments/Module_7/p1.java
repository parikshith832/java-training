package Assignments.Module_7;

public class p1 {// 1 Implement Binary Search iteratively and recursively.
    static void iterative(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("(iterative) index: " + mid);
                return;
            }
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;

        }
        System.out.println("Not found");
    }

    static int binary(int arr[], int left, int right, int key) {

        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] > key)
            return binary(arr, left, mid - 1, key);
        return binary(arr, mid + 1, right, key);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int key = 8;
        iterative(arr, key);
        int res = binary(arr, 0, arr.length - 1, key);
        System.out.println("(recursive) Index: " + res);
    }
}