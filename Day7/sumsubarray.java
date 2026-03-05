package Day7;

public class sumsubarray {
    boolean check(int arr[], int sum) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            for (int j = i + 1; j < n; j++) {
                temp += arr[j];
                if (temp == sum) {
                    System.out.println("start " + ++i + " end " + ++j);
                    return false;
                }

            }
        }
        return true;
    }

    void check2(int arr[], int sum) {
        int start = 0;
        int end = 0;
        int Sum = 0;
        int n = arr.length;

        while (end < n) {
            Sum = Sum + arr[end];

            while (Sum > sum && start <= end) {
                Sum = Sum - arr[start];
                start++;
            }

            if (Sum == sum) {
                System.out.println("start: " + (start + 1) + " end: " + (end + 1));
                break;
            }

            end++;
        }
    }

    public static void main(String[] args) {
        sumsubarray ob = new sumsubarray();
        int arr[] = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int sum = 12;

        if (ob.check(arr, sum)) {
            System.out.println(-1);
        }
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum1 = 15;
        if (ob.check(arr1, sum1)) {
            System.out.println(-1);
        }
        ob.check2(arr1, sum1);
    }
}
