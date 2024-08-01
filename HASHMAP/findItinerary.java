import java.util.*;

public class findItinerary {

    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();
        
        // Swap Key and Values
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        
        // Return key which did not Match With the rev key
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key))
                return key;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Find the starting point
        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.print(start + "->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
