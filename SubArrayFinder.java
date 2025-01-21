import java.util.ArrayList;
import java.util.List;

public class SubArrayFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = findSubArrays(arr);

        System.out.println(result); 
    }
    public static List<List<Integer>> findSubArrays(int[] arr){
        List<List<Integer>> subArrays = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                List<Integer> subArray = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    subArray.add(arr[k]);
                }
                subArrays.add(subArray);
            }
        }

        return subArrays;
    }
}
