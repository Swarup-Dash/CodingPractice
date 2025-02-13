public class ReverseString {
    public static void main(String[] args) {
        String s = "This is a string";
        char[] ch = s.toCharArray();
        String res = "";
        int n = ch.length;
        for(int i=n-1; i>=0; i--){
            res+=ch[i];
        }
        System.out.println(res);
    }
}
