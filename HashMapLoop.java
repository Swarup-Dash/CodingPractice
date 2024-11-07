import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        
        HashMap<String, Object> myHash = new HashMap<String, Object>();

        myHash.put("Swarup", 8);
        myHash.put("Lingaraj", 8.5);
        myHash.put("Aman", 7.52);
        myHash.put("Sajan", 9.5);
        myHash.put("Srijit", 5);

        System.out.println(myHash);

        //Loop Through HashMap

        //Use the keySet() method if you only want the keys
        for (String map : myHash.keySet()) {
            System.out.println(map);
        }

        //use the values() method if you only want the values
        for (Object mapValues : myHash.values()) { //Change type of mapValues to object, because it can't convert from element type Object to String
            System.out.println(mapValues);
        }

        // Print keys and values
        for (String i : myHash.keySet()) {
            System.out.println("key: " + i + " value: " + myHash.get(i));
        }
        
    }
}
