import java.util.ArrayList;
import java.util.List;

public class UniqueCombination {
     public static void main(String[] args) {
        int[] arr = {0, 3, 4, 5, 6, 9};
        int target = 9;
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int j = (arr.length-1);
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                result.add(new int[]{arr[i], arr[j]});
                i++;
                j--;
            }else if(sum<target){
                i+=1;
            }else{
                j-=1;
            }
        }
        for (int[] pair : result) {
            System.out.println("Pair: (" + pair[0] + ", " + pair[1] + ")");
        }

     }
}
