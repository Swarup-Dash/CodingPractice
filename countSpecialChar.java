import java.util.HashMap;

public class countSpecialChar{
    public static void main(String[] args) {
        String input = "Hello, @Everyone ! This is the new payment gateway for multiple payment types (cards, apple pay, EFT). You can pay $400 and proceed* , Send screenshot to emailsample_name@yahoo.com, *TnC Applied ";

        HashMap<Character, Integer> specialch = new HashMap<>();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                specialch.put(ch, specialch.getOrDefault(ch, 0)+1);
            }
        }
        for (Character ch : specialch.keySet()) {
            System.out.println(ch + " : " + specialch.get(ch));
        }
    }
}