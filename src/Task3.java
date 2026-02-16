import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Dana", 77);

        Integer oldValue = map.put("Dana", 80);

        System.out.println("Old value: " + oldValue);
        System.out.println("New map: " + map);
    }
}
