import java.util.HashSet;
import java.util.Set;

public class ArraySortAndRemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5,6,3,2,5};
        Integer[] result = arraySortrmvDuplicate(nums);
        for(int res: result){
            System.out.print(res+" ");
        }
    }

    static Integer[] arraySortrmvDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        Integer[] arr = set.toArray(new Integer[0]);
        for (int i = 0; i < arr.length - 1; i++) { //Bubble Sort
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
