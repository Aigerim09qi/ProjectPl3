import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 90);
        map.put("Azat", 85);

        checkStudent(map, "Aida");
        checkStudent(map, "Mira");
        checkStudent(map, "Azat");
    }

    public static void checkStudent(HashMap<String, Integer> map, String name) {
        int score = map.getOrDefault(name, -1);

        if (score == -1) {
            System.out.println(name + ": Not found");
        } else {
            System.out.println(name + ": " + score);
        }
    }
}
