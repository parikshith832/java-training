package Day10;

public class subseq {
    static void subseqq(String str, int index, String list) {
        if (index == str.length()) {
            System.out.println(list);
            return;

        }
        subseqq(str, index + 1, (list + str.charAt(index)));
        // System.out.println("1");
        subseqq(str, index + 1, list);
        // System.out.println("2");

    }

    public static void main(String[] args) {
        String str = "abc";
        subseqq(str, 0, "");
    }
}
