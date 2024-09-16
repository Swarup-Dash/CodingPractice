public class ReverseAllWord {

    public static void main(String[] args) {
        String input = "Ram is Going to School";
        char ch;
        String newStr = "";

        for(int i = 0; i < input.length(); i++){
            ch = input.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
    
}
