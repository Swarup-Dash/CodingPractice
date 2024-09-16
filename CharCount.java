public class CharCount {

    public static int[] charCount(String s){
        int[] count = new int[256];

        for(int i = 0; i<s.length();i++){
            count[s.charAt(i)]++;
        }
        return count;

    }
    public static void main(String[] args) {
        String s = "leetcode";
        int res[]=charCount(s);

        for(int i = 0; i<s.length();i++){
            if(res[i]>0){
                System.out.println((char) i + ":" +res[i]);
            }
        }


    }
}
