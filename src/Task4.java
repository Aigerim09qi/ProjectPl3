import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Azat", 92);

        map.remove("Azat");
        System.out.println(map);

        boolean removed = map.remove("NonExisting") != null;
        System.out.println("Removed? " + removed);
    }
}

