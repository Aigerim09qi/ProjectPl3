import java.util.HashMap;

public class Task12 {
    public static void main(String[] args) {

        String text = "Java is fun and Java is powerful and fun";

        String[] words = text.toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}


