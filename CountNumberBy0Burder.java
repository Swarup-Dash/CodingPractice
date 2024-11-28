import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountNumberBy0Burder {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,2,0,4,0,5,6,5,0,0,7,6,7};
        HashMap<Integer, Integer> count = new LinkedHashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count[nums[i]]++;
                }
                if(nums[j]==0){
                    j++;
                }
            }  
        }
        System.out.println(count);
    }
}
