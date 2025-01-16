public class EqualPartitionIndex {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 5, 4, 10};
        boolean found = false;

        for(int i=1; i<arr.length;i++){
            int leftSum = 0;
            int rightSum = 0;

            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                rightSum+=arr[j];
            }

            if(leftSum==rightSum){
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Found");
            System.out.println("Not Found.....");
        }
    }
}
