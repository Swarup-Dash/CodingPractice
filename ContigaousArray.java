public class ContigaousArray {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int n = nums.length;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            int count0 = 0;
            int count1 = 0;

            for (int j = i; j < n; j++) {
                // Update counts for 0s and 1s
                if (nums[j] == 0) {
                    count0++;
                } else {
                    count1++;
                }

                // Check if the counts are equal
                if (count0 == count1) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    // Test the function
    public static void main(String[] args) {
        ContigaousArray solution = new ContigaousArray();
        int[] nums = {0, 1, 0, 1, 1};
        System.out.println(solution.findMaxLength(nums)); // Output: 4
    }
}
