package Day6;

public class oddevenarr {

    /*
     * Given an array if lenght n your task is to print the maximum length of
     * subarray that are arranged in either even and odd or odd and even
     */
    public static void main(String[] args) {
        oddevenarr ob = new oddevenarr();
        int arr[] = { 10, 12, 14, 7, 8 };
        int n = arr.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] % 2 == 0/* even */ && arr[i - 1] % 2 != 0 /* odd */ ||
                    arr[i] % 2 != 0/* odd */ && arr[i - 1] % 2 == 0/* even */) {
                count++;
            }
        }

        System.out.println("occurance: " + count);
    }
}
