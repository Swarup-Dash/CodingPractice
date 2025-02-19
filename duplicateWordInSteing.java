//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class duplicateWordInSteing {
    public static void main(String[] args) {
        String s = "Big black bug bit a big black dog on his big black nose";
        String[] arr = s.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        //List<String> myList = new ArrayList<>();
        for(String s1:arr){
            // String s2=s1.toLowerCase();
            // myMap.put(s2, myMap.getOrDefault(s2, 0)+1); To count value without checking the case.
            myMap.put(s1, myMap.getOrDefault(s1, 0)+1);
        }
        Set<String> mySet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(myMap.get(arr[i])>1){
                mySet.add(arr[i]);
            }
        }

        System.out.println(mySet);
    }
}
