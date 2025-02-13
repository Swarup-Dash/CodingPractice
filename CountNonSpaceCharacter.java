public class CountNonSpaceCharacter {
    public static void main(String[] args) {
        String s = "This is a string";
        char[] ch = s.toCharArray();
        int count = 0;
        for(char c: ch){
            if(c!=' '){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
