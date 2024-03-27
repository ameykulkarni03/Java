import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // adding data
        map.put("china",120);
        map.put("India",150);
        map.put("US",30);

        System.out.println(map);

        //searching
        boolean isContain = map.containsKey("china");
        System.out.println(isContain);

        //accessing value of key
        int value = map.get("India");
        System.out.println(value);

        //iteration
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        
        //another method
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
