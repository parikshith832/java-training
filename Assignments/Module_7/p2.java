package Assignments.Module_7;

public class p2 {// 2 Find first and last occurrence of an element using Binary Search.
    static int first(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                res = mid;
                r = mid - 1;
            } else if (arr[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return res;
    }

    static int last(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                res = mid;
                l = mid + 1;
            } else if (arr[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4 };

        System.out.println("First: " + first(arr, 2));
        System.out.println("Last: " + last(arr, 2));
    }
}
