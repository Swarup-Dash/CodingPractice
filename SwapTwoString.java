public class SwapTwoString {
    public static void main(String[] args) {
        String s = "Hello world";
        String[] str = s.split(" ");
        String res = "";
        for(int i=str.length-1;i>=0;i--){
            res+=str[i]+" ";
        }
        System.out.println(res);
    }
}
