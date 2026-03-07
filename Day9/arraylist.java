package Day9;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1, 20);
        list.add(30);
        list.add(3, 40);
        System.out.println(list);
        list.set(2, 90);
        System.out.println("element in index 2 after setting it to 90: " + (list.get(2)));
        System.out.println("size of array list: " + list.size());
        list.remove(1);
        System.out.println("after removing index 1:" + list);
        System.out.println("contains 90 :" + list.contains(90));
        list.clear();
        System.out.println("after clear: " + list);

    }
}
