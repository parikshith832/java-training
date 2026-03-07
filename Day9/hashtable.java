package Day9;

public class hashtable {
    static int tablesize = 10;
    static int hashtable[] = new int[tablesize];

    static void insert(int key) {
        int index = key % tablesize;
        hashtable[index] = key;
    }

    static void display() {
        for (int i = 0; i < tablesize; i++) {
            System.out.println(i + " " + hashtable[i]);
        }
    }

    public static void main(String[] args) {
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        display();
    }
}
