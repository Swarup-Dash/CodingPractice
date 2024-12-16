
public class ArrayRotation {
    public static int[] arrayRotation(int[] arr, int k, int multi){
        
        for(int i=0; i<k;i++){
            int minIndex = 0;
            for(int j = 0; j<arr.length;j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            arr[minIndex]*=multi;
        }
        return arr;
     }
    public static void main(String[] arr){
        int[] nums = {2,1,3,5,6};
        int k = 5; 
        int multiplier = 2;

        int[] res = arrayRotation(nums, k, multiplier);
        for(int num: res){
            System.out.print(num + " ");
        }
    }
}
