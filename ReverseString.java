public class ReverseString {
    public static void main(String[] args) {
        String s = "This is a string";
        char[] ch = s.toCharArray();
        String res = "";
        int n = ch.length-1;
        for(int i=n; i>=0; i++){
            res+=ch[i];
        }
        System.out.println(res);
    }
}
