import java.util.HashMap;
import java.util.LinkedHashMap; 
class Hashmap{
    public static void main(String[] args) {
        
        HashMap<String, String> myHash = new LinkedHashMap<String, String>();//LinkedHashMap used for to print the output in order, because HashMap is not a order collection;

        //to add items to it, use the put()
        myHash.put("Swarup", "5");
        myHash.put("Aman", "4");
        myHash.put("Lingaraj", "6");
        myHash.put("Amrit", "8");
        myHash.put("Samrat", "9");

        System.out.println(myHash);

        //To access a value in the HashMap, use the get() method and refer to its key
        System.out.println(myHash.get("Amrit"));

        //To remove an item, use the remove() method and refer to the key
        myHash.remove("Lingaraj");
        System.out.println(myHash);

        //To find out how many items there are, use the size() method
        System.out.println(myHash.size());

        //To remove all items, use the clear() method
        myHash.clear();
        System.out.println(myHash); //Output: {}
    }
}