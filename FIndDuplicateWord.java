import java.util.*;

public class FIndDuplicateWord {
    public static void main(String[] args) {
        String s = "Bread butter and bread";
        String[] words = s.toLowerCase().split("\\s+");
        Set<String> wordSet = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words) {
            if (!wordSet.add(word)) {
                duplicates.add(word);
            }
        }

        for (String word : duplicates) {
            System.out.println(word.toUpperCase());
        }
    }
}
