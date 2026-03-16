package Assignments.Module_8;

class Solution191 {

    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            count += (n & 1);

            n = n >>> 1;
        }

        return count;
    }
}

public class leet191 {

    public static void main(String[] args) {

        Solution191 obj = new Solution191();

        int n = 11;

        System.out.println(obj.hammingWeight(n));
    }
}