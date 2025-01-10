import java.util.ArrayList;
import java.util.List;

public class ReorderArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int[] result = reorderArray(arr);

        for(int res: result){
            System.out.print(res+" ");
        }
    }
    static int[] reorderArray(int[] arr){

        List<Integer> evens= new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for(int num: arr){
            if(num%2==0){
                evens.add(num);
            }
            else{
                odds.add(num);
            }
        }

        int index= 0;
        for(int even: evens){
            arr[index++]=even;
        }
        for(int odd: odds){
            arr[index++]=odd;
        }

        return arr;
    }
}
