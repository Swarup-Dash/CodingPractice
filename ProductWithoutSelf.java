public class ProductWithoutSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productwithoutself(nums);
        for(int res: result){
            System.out.print(res+" ");
        }
    }
    static int[] productwithoutself(int[] nums){

        int product = 1;
        for(int i=0; i<nums.length;i++){
            product*=nums[i];
        }
        for(int i=0; i<nums.length;i++){
            nums[i] = product/nums[i];
        }

        return nums;
    }
}
