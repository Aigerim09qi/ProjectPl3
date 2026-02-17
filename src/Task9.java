import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 90);
        map.put("Dana", 80);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
