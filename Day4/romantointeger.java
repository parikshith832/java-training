package Day4;

import java.util.Scanner;

public class romantointeger {
    static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();// uppercase

        int cur = 0;// current ex:IV I
        // VI
        int nxt = 0;// next ex:IV V
        //
        for (int i = s.length() - 1; i >= 0; i--) {//
            char c = s.charAt(i);// V
            int value = getValue(c);// 5
            // 1
            if (value < nxt) {// 5<0 false
                // 1<5 false
                cur -= value;// cur=5-1=4
            } else {
                cur += value;// cur=5

            }
            nxt = value;// 5

        }
        System.out.println(cur);

    }

}
