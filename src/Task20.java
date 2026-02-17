import java.util.HashMap;

public class Task20 {
    public static void main(String[] args) {

        HashMap<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);

        HashMap<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);

        for (String key : scores2.keySet()) {
            scores1.merge(key, scores2.get(key), Integer::sum);
        }

        System.out.println(scores1);
    }
}

