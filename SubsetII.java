import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2}; // Fixed array initialization
        List<List<Integer>> result = subsetsWithDup(nums); // Correct method return type
        System.out.println(result); // Print the result to verify output
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>(); // Handle edge cases
        }

        int n = nums.length;
        Set<List<Integer>> uniqueSet = new HashSet<>();
        int totalSubset = 1 << n; // Total subsets = 2^n

        for (int i = 0; i < totalSubset; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            subset.sort(Integer::compareTo); // Sort to handle duplicates
            uniqueSet.add(subset); // Add to set for uniqueness
        }

        return new ArrayList<>(uniqueSet); // Convert set to list
    }
}
