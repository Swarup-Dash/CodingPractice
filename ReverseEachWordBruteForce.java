public class ReverseEachWordBruteForce {
    public static void main(String[] args) {
        String s = "Java Concept Of The Day";
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord += words[i].charAt(j); 
            }
            result += reversedWord + " "; 
        }

        System.out.println(result.trim());
    }
}
