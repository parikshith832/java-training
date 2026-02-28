package Day6;

public class searchInsert {// 35
    int search(int arr[], int t) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= t) { // it checks whether the target is within the range of array elements
                               // if it element is not present the loop breaks when the target gets lesser than
                               // the element in array
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        searchInsert ob = new searchInsert();
        int nums[] = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(ob.search(nums, target));
    }
}
