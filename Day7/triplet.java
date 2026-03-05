package Day7;

//accenture
public class triplet {// task is to count number of triplets that we can form
    // triplet is sum of 2 number is equals to the value in that same array
    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 3, 9 };
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int temp = (arr[i] + arr[j]);
                    if (j != k && i != k && temp == arr[k]) {
                        System.out.println(temp);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
