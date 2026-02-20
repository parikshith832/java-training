package Day1;

import java.util.Scanner;

public class digicount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int a = sc.nextInt();
        if (a == 0) {
            i = 1;
        } else {
            while (a != 0) {
                i++;
                a = a / 10;
            }
        }
        System.out.println(i);
    }
}
