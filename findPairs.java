import java.util.Arrays;

public class findPairs {
    public int findPairss(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;

        Arrays.sort(nums); 
        int left = 0, right = 1, count = 0;

        while (right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;
            } else if (nums[right] - nums[left] > k) {
                left++;
            } else {
                count++;
                left++;
                right++;
                while (left < nums.length && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int k = 0;
        findPairs sol = new findPairs();
        int res = sol.findPairss(nums, k);
        System.out.println(res);
    }
}
