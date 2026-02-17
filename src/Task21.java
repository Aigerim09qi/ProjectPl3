import java.util.*;

public class Task21 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 90);
        map.put("Dana", 90);
        map.put("Azat", 80);

        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();

        for (String key : map.keySet()) {
            int value = map.get(key);

            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        System.out.println(inverted);
    }
}

