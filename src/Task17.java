import java.util.HashMap;

public class Task17 {
    public static void main(String[] args) {

        String[] arr = {"apple","banana","apple","orange","banana","kiwi"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println("Duplicate: " + key);
            }
        }
    }
}

