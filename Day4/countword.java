package Day4;

public class countword {
    public static void main(String[] args) {
        String str = "Java is Easy";
        String[] arr = str.split(" ");
        int count = arr.length;
        System.out.println(count);
        // or.........
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                cnt++;
        }
        System.out.println(cnt);
    }
}
