import java.util.HashMap;

public class Task8 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 90);

        System.out.println("Original map: " + map);

        // 1️⃣ Conditional replace
        boolean replaced = map.replace("Aida", 85, 86);
        System.out.println("Conditional replace success? " + replaced);
        System.out.println("After conditional replace: " + map);

        // 2️⃣ Unconditional replace
        Integer oldValue = map.replace("Aida", 91);
        System.out.println("Old value returned: " + oldValue);
        System.out.println("After unconditional replace: " + map);

        // 3️⃣ Try replacing missing key
        boolean missingReplace = map.replace("Mira", 70, 80);
        System.out.println("Replacing missing key success? " + missingReplace);

        Integer missingUnconditional = map.replace("Mira", 100);
        System.out.println("Unconditional replace missing key returns: " + missingUnconditional);

        System.out.println("Final map: " + map);
    }
}


