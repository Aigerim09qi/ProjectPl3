import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);

        System.out.println("Is empty? " + map.isEmpty());

        map.clear();
        System.out.println("After clear: " + map.isEmpty());
    }
}
