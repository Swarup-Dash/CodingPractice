public class FindSubArray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        findSubarray(arr);
    }
    public static void findSubarray(int[] arr){
        for(int i=0; i< arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[ ");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("]");
            }
        }
    }
}