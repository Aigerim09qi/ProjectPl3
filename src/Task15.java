import java.util.HashMap;

public class Task15 {
    public static void main(String[] args) {

        String word = "swiss";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : word.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                break;
            }
        }
    }
}

