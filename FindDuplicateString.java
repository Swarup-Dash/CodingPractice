import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateString {
    public static void main(String[] args) {
        String str1 = "hackerearth";
        char[] ch = str1.toCharArray();
        Set<Character> res = new HashSet<>();
        List<Character> duplicate = new ArrayList<Character>();

        for(char c: ch){
            if(!res.add(c) && !duplicate.contains(c)){
                duplicate.add(c);
            }
        }
        //System.out.println(duplicate);
        for(Character ch1: duplicate){
            System.out.print(ch1+" ");
        }
    }
}
