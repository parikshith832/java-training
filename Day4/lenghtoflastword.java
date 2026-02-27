package Day4;

import java.util.Scanner;

public class lenghtoflastword {// leetcode 58

    void opt1(String s) {// option 1
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i++;
        }
        while (i >= 0 && s.charAt(i) == ' ') {
            length++;
            i--;
        }
    }

    int opt2(String s) {// very optimal
        String str1 = s.trim();
        int last = str1.lastIndexOf(' ');
        return s.length() - last - 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.trim();

        int count = 0;
        String[] arr = str1.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            count = count + 1;
        }
        String str2 = arr[count];
        System.out.println(str2);
        System.out.println(str2.length());

    }
}
