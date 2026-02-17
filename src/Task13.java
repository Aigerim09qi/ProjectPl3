import java.util.HashMap;

public class Task13 {
    public static void main(String[] args) {

        String word = "Mississippi".toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}

