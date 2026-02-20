
package Day2;

import java.util.*;

public class bit {
    static int count = 0;

    int bitz(int n) {

        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bit ob = new bit();
        System.out.println("enter the no: ");
        int n = sc.nextInt();

        System.out.println("no of 1 bits's= " + ob.bitz(n));

    }
}
