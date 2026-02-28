package Day6;

public class sumrevarr {
    void rev(int arr[]) {
        int n = arr.length;
        int rev[] = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += rev[i];
            }
        }
    }

    // reverse the array then find the sum of elements located at even indices of
    // the reversed array
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {// i=5,i=4,i=3,i=2,i=1,i=0 reversed index
            if ((n - 1 - i) % 2 == 0) {// n=6 6-1-5=0 , 5-4=1x , 5-3=2=0 , 5-2=3x, 5-1=4=0 checking if it is even
                sum += arr[i];// sum=60 i=5 , 40 i=3, 20 i=1 adding the even index element
            }
        }

        System.out.println("sum of elements in even pos in a reversed array: " + sum);
    }
}
