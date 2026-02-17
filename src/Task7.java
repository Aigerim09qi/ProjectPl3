import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 90);

        map.putIfAbsent("Aida", 95);
        map.putIfAbsent("Mira", 88);

        System.out.println(map);
    }
}

