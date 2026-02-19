import java.util.*;

public class happyno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        while (temp != 1 && temp != 4) {
            int Sum = 0;
            while (temp > 0) {
                int n = temp % 10;
                Sum += n * n;
                temp /= 10;
            }
            temp = Sum;
        }
        if (temp == 1) {
            System.out.println("happy no");

        } else {
            System.out.println("not");
        }

    }
}
