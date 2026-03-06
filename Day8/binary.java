package Day8;

public class binary {// 704. Binary Search
    // most important
    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int key = 9;
        int pos = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(pos);

    }
}
