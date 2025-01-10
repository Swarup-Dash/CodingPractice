import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Desperation";
        String str2 = "A Rope Ends It";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
    static boolean areAnagrams(String str1, String str2){

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length()!=str2.length()){
            return false;
        }
        
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
