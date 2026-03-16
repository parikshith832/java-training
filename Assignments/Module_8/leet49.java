package Assignments.Module_8;

import java.util.*;

class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

public class leet49 {

    public static void main(String[] args) {

        Solution49 obj = new Solution49();

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println(result);
    }
}