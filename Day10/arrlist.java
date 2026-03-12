package Day10;

import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<person> list = new ArrayList<>();
        list.add(new person("pari", 21));
        list.add(new person("darshan", 21));
        list.add(new person("giri", 20));
        list.add(new person("rishu", 21));
        System.out.println(list);
    }
}
