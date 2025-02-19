public class FindMissingNum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 7, 9};

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                System.out.print(nums[i]+1+" ");
            }
        }
    }

}
