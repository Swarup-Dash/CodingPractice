public class FindDuplicate {
    public static int[] findDuplicate(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        int[] temp = new int[arr.length]; // Temporary array for duplicates
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (visited[i])
                continue; // Skip if already processed

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[index++] = arr[i];
                    visited[j] = true; 
                    break; 
                }
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 3, 4, 9, 9};
        int[] res = findDuplicate(arr);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}



// import java.util.HashSet;
// import java.util.ArrayList;
// import java.util.List;

// public class FindDuplicates {

//     public static int[] findDuplicates(int[] nums) {
//         // Set to store unique elements
//         HashSet<Integer> set = new HashSet<>();
//         // List to store the elements with duplicates
//         List<Integer> duplicates = new ArrayList<>();

//         for (int num : nums) {
//             // If the number is already in the set, add it to duplicates
//             if (!set.add(num)) {
//                 duplicates.add(num);
//             }
//         }

//         // Convert the list of duplicates to an array
//         int[] result = new int[duplicates.size()];
//         for (int i = 0; i < duplicates.size(); i++) {
//             result[i] = duplicates.get(i);
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] input = {0, 1, 1, 2, 3, 6, 9, 9};
//         int[] duplicates = findDuplicates(input);

//         // Print the duplicates
//         if (duplicates.length > 0) {
//             System.out.print("Duplicates: ");
//             for (int num : duplicates) {
//                 System.out.print(num + " ");
//             }
//         } else {
//             System.out.println("No duplicates found.");
//         }
//     }
// }
