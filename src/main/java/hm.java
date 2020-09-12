// Import the HashMap class
import java.util.HashMap;

import static sun.tools.jstat.Alignment.keySet;

public class hm {
    public static void main(String[] args) {
        // Create a HashMap object hm1
        HashMap<String, String> hm1 = new HashMap<String, String>();

        // Add keys and values (Country, City)
        hm1.put("England", "London");
        hm1.put("Germany", "Berlin");
        hm1.put("Norway", "Oslo");
        hm1.put("USA", "Washington DC");
     //   System.out.println(hm1);
        hm1.get("England");
        System.out.println(hm1);
        hm1.remove("England");
        System.out.println(hm1);
        System.out.println(hm1.size());
        for(String i:keySet()){

        }
    }
}