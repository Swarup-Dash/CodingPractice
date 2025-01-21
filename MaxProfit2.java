public class MaxProfit2 {
    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};//Sp{7,1,5,3,6,4}
        int result = totalProfit(nums);
        System.out.println(result);
    }
    public static int totalProfit(int[] nums){
        int profit = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                profit+=nums[i]-nums[i-1];
            }
        }
        return profit;
    }
}
