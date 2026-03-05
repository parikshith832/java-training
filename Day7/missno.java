package Day7;

public class missno {// find the missing number
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        System.out.println(total);
        for (int i = 0; i < n - 1; i++) {
            total -= arr[i];
        }
        System.out.println(total);
    }
}
