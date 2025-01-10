import java.util.HashSet;
import java.util.Set;

public class HasUniqueCharacter {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "machine";
        System.out.println("test --"+ hasUniqueChar(str1));
        System.out.println("machine --"+ hasUniqueChar(str2));
    }
    static boolean hasUniqueChar(String str){

        Set<Character> set = new HashSet<>();
        for(char ch: str.toCharArray()){
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }

        return true;
    }
}
