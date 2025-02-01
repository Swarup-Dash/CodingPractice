public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4};
        boolean res = isArraySpecial(nums);
        System.out.println(res);
    }
    public static boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] % 2) == (nums[i - 1] % 2)) {
                return false; 
            }
        }
        return true;
    }
}
