public class removeVowels {
    public static void main(String[] args) {
       String str = "Remove all Vowels";
       String res = "";
       char[] ch = str.toCharArray();
       for(char c:ch){
        if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
            res+=c;
        }
       }
       System.out.println(res);
    }
}
