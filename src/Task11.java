import java.util.HashMap;
import java.util.Map;

public class Task11 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 98);
        map.put("Dana", 83);
        map.put("Azat", 90);

        int max = Integer.MIN_VALUE;
        String topStudent = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Top student: " + topStudent + " - " + max);
    }
}

