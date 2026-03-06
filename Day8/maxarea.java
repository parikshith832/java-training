package Day8;

public class maxarea {
    public static void main(String[] args) {

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        int cur;
        while (left < right) {
            cur = Math.min(height[left], height[right]);// Find the smaller height between two lines
            cur = cur * (right - left);// area= height * width (distance between two pointers)
            // or
            // cur = Math.min(height[left] * (right - left), height[right] * (right -
            // left));
            max = Math.max(max, cur);

            if (height[left] < height[right]) {// Move the pointer with smaller height
                left++;// move left to right
            } else {
                right--;// move right to left
            }
        }
        System.out.println(max);
    }
}
