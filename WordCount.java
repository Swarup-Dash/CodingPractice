public class WordCount {
    public static void main(String[] args) {
        String words = "This is a learning program";
        int count = countWord(words);
        System.out.println(count);
    }
    static int countWord(String words){

        String[] arr = words.trim().split("\\s+");
        int count = arr.length;

        return count;
    }
}
