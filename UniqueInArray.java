import java.util.HashMap;

public class UniqueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        uniqueNum(arr);
    }
    public static void uniqueNum(int[] arr){
        
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int key : countMap.keySet()) {
            if(countMap.get(key) == 1){
                System.out.println(key);
            }
            
        }
                
    }
}
