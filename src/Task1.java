import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        System.out.println(map);
        System.out.println("Size: " + map.size());
    }
}
