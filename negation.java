public class negation {
    public static void main(String[] args) {
        System.out.println(~5);// -n-1
        // ~(101)=>010
        // 010 2's complement =>101+1=110=6
        // ~ makes it negative.
        System.out.println(5 << 5);
        // left shift (<<) 101 => 1010
        // n*2**times
        System.out.println(4 >> 2);
        // right shift (>>) 101 => 1010
        // n/2**times it is always integer
        System.out.println(1 % 10);
    }
}
