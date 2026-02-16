import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Dana", 77);

        System.out.println("Aida: " + map.get("Aida"));

        if (map.containsKey("Mira")) {
            System.out.println("Mira: " + map.get("Mira"));
        } else {
            System.out.println("Mira not found");
        }
    }
}
