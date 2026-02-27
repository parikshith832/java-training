package Day4;

public class occurance {
    public static void main(String[] args) {
        String str = "Banana";
        char tar = 'a';
        int count = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tar) {
                count++;
            }
        }
        System.out.println("occurance: " + count);
    }
}
