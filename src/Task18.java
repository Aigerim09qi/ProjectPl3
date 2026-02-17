import java.util.HashMap;

public class Task18 {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Aida", 90);
        map1.put("Azat", 80);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Azat", 80);
        map2.put("Aida", 90);

        System.out.println(map1.equals(map2));
        System.out.println(map1.hashCode() == map2.hashCode());
    }
}
