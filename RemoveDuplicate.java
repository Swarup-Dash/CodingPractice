import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args){
        String s = "hackerearth";
        char[] ch = s.toCharArray();
        LinkedHashSet<Character> uniqueSet = new LinkedHashSet<>();

        for(char c: ch){
            if(!uniqueSet.contains(c)){
                uniqueSet.add(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char r: uniqueSet){
            res.append(r);
        }
        System.out.println(res);
        //System.out.println(uniqueSet); //[h, a, c, k, e, r, t]
    }
}
