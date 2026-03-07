package Day9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> list = new LinkedHashMap<>();
        list.put(3, "cat");
        list.put(1, "apple");
        list.put(2, "ball");
        list.put(1, "dog");
        System.out.println("hashmap: " + list);

        TreeMap<Integer, String> list1 = new TreeMap<>();
        list1.put(3, "cat");
        list1.put(1, "apple");
        list1.put(2, "ball");
        list1.put(1, "dog");
        System.out.println("tree map: " + list1);

        HashMap<Integer, Integer> list2 = new HashMap<>();
        // TreeMap<Integer, Integer> list2 = new TreeMap<>();
        list2.put(1, 10);
        list2.put(2, 20);
        list2.put(3, 30);
        list2.put(4, 40);
        System.out.println("both key and value are integer: " + list2);
        System.out.println(list2.get(2));
        list2.remove(3);
        System.out.println(list2);
        System.out.println(list2.containsKey(1));
        System.out.println(list2.containsValue(40));
        System.out.println(list2.keySet());
        System.out.println(list2.values());

    }
}
