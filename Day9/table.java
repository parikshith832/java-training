package Day9;

public class table {

    static int size = 10;
    static int[] table = new int[size];

    static void insert(int key) {
        int index = key % size;
        while (table[index] != 0) {
            index = (index + 1) % size;
            /*
             * int i=1;
             * while(table[index]!=0){
             * index=(index+i*i)%size;
             * i++;
             * }
             */

        }
        table[index] = key;
    }

    static void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "--> " + table[i]);

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
