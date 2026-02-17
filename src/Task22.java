import java.util.*;

public class Task22 {
    public static void main(String[] args) {

        String text = "student study hard student practice daily student improve skills daily practice";

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : text.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String top1 = "";
        String top2 = "";
        int max1 = 0, max2 = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();

            if (count > max1) {
                max2 = max1;
                top2 = top1;

                max1 = count;
                top1 = entry.getKey();
            } else if (count > max2) {
                max2 = count;
                top2 = entry.getKey();
            }
        }

        System.out.println("Top 1: " + top1);
        System.out.println("Top 2: " + top2);
    }
}

