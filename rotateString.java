public class rotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        if(s.length()!=goal.length()){
            System.out.println(false);
            return;
        }

        for(int i=0; i < s.length(); i++){
            String rotated = s.substring(i) + s.substring(0, i);
            // Use .equals() to compare strings by content
            if (rotated.equals(goal)) {
                System.out.println(true);
                return; // Exit as we found a match
            }
        }
        
        System.out.println(false);
        
        
    }
}
