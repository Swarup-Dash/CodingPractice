public class CharacterCount {
    public static void main(String[] args) {
        String input = "aaabbc";
        int count =1;
        StringBuilder result = new StringBuilder();
        for(int i=1;i<input.length();i++){
            if(input.charAt(i-1)==input.charAt(i)){
                count++;
            }
            else{
                result.append(input.charAt(i-1)).append(count);
                count = 1;
            }
        }
        result.append(input.charAt(input.length()-1)).append(count);
        System.out.println(result.toString());
    }
}
