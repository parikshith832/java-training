package Assignments.Module_7;

public class p3 {// 3 Search an element in a rotated sorted array.
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                System.out.println("Index: " + mid);
                return;

            }
            if (arr[l] <= arr[mid]) {
                if (target >= arr[l] && target < arr[mid])
                    r = mid - 1;
                else
                    l = mid + 1;

            } else {
                if (target > arr[mid] && target <= arr[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}
