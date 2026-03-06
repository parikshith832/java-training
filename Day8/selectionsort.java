package Day8;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 29, 10, 47, 14, 18 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap after finding minimum
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
