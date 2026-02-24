package Assignments.Module_1;

public class sumeven {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;

            }
            i++;

        }
        System.out.println("Sum of even no from 1 to 100 is: " + sum);
    }
}
