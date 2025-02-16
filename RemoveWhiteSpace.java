public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s = "I Am Not String";
        char[] ch = s.toCharArray();
        String res = "";
        for(int i=0;i<s.length();i++){
            if(ch[i]!=' '){
                res+=ch[i];
            }
        }
        System.out.println(res);
    }
}
