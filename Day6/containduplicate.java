package Day6;

public class containduplicate {// 217

    boolean duplicate(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    return true;// duplicate found
                }
        }

        return false;// duplicate not found
    }

    public static void main(String[] args) {
        containduplicate ob = new containduplicate();
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        if (ob.duplicate(nums))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
