import java.util.HashMap;
import java.util.Map;

public class strCount{
    public static void main(String[] args) {
        String str1 = "My name is Swarup";
        Map<Character, Integer> res = new HashMap<Character, Integer>();
        char[] ch = str1.toCharArray();
        for(char c: ch){
            if(c!=' '){
                res.put(c, res.getOrDefault(c, 0)+1);   
            }
        }
         
        System.out.println(res);
    }
}