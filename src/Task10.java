import java.util.HashMap;

public class Task10 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 90);
        map.put("Dana", 75);
        map.put("Azat", 85);

        int count = 0;

        for (Integer value : map.values()) {
            if (value >= 80) {
                count++;
            }
        }

        System.out.println("Count >= 80: " + count);
    }
}

