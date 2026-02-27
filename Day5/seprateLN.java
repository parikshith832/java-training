package Day5;

import java.util.*;

public class seprateLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        StringBuilder sbl = new StringBuilder();

        StringBuilder sbn = new StringBuilder();
        int i = str.length() - 1;
        str.toCharArray();
        // for(char ch:str.toCharArray){
        while (i >= 0) {
            Character c = str.charAt(i);
            if (Character.isLetter(c)) {
                sbl.append(c);
            } else if (Character.isDigit(c)) {
                sbn.append(c);
            }
            i--;
        }
        System.out.println(sbl + " , " + sbn);
    }

}
