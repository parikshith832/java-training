package Day8;

/* searching :
linear search 
binary search
jump search
interpolation search*/
public class linear {
    // searching student in attendance list
    // searching song in playlist
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int n = arr.length;
        int key = 4;
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                pos = i;
            }
        }
        System.out.println(pos);
    }

}
