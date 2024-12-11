import java.util.ArrayList;
import java.util.List;

public class DuplicateElementArray {
    public static void main(String[] args) {
        String[] arr = {"Swarup", "Dash", "Gudu", "Swarup", "Deepak"};
        String[] res = findDuplicate(arr);
        
        // Print duplicates
        if (res.length == 0) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicate elements: ");
            for (String s : res) {
                System.out.print(s + " ");
            }
        }
    }

    public static String[] findDuplicate(String[] arr) {
        List<String> duplicate = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && !duplicate.contains(arr[i])) {
                    duplicate.add(arr[i]); // Add to duplicate list
                    break;
                }
            }
        }
        
        // Convert the list to an array
        return duplicate.toArray(new String[0]);
    }
}
