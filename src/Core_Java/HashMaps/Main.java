package Core_Java.HashMaps;

import java.util.HashMap;
/*
    - HashMap implements the Map Interface (need to import)
    - HashMap is similar to ArrayList ,  but with Key-value pairs
    - stores objects , need to use Wrapper Class
    - Ex: (name,email), (username,userID), (country,capital)
 */

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> contries = new HashMap<>();

        // adding key , value pair
        contries.put("USA","Washington DC");
        contries.put("India","New Delhi");
        contries.put("Russia","Moscow");
        contries.put("China","Beijing");

        System.out.println(contries.size());
        contries.remove("China");
        System.out.println(contries.get("India"));
        System.out.println(contries.keySet());
        System.out.println(contries.values());
        System.out.println(contries.entrySet());
        System.out.println(contries.containsKey("Russia"));
        contries.replace("USA","Los Angeles");
        System.out.println(contries.get("USA"));

    }
}
