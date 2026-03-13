package Day10;

import java.util.ArrayList;

public class subsetrec {
    static void subset(int arr[], int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subset(arr, index + 1, list);
        // System.out.println("1");
        list.remove(list.size() - 1);
        subset(arr, index + 1, list);
        // System.out.println("2");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        subset(arr, 0, new ArrayList<>());
    }
}
