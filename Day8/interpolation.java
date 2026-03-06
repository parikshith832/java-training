package Day8;

public class interpolation {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int key = 30;
        int pos = -1;
        while (l <= h && key >= arr[l] && key <= arr[h]) {// checks if left <= right and key>=arr[current element] and
                                                          // key<=arr[last element]
            pos = l + ((key - arr[l]) * (h - l)) / (arr[h] - arr[l]);
            if (arr[pos] == key) {
                System.out.println("Element found at index: " + pos);
                return;
            }
            if (arr[pos] < key) {
                l = pos + 1;

            } else
                h = pos - 1;
        }
        System.out.println("element not found");
    }
}
