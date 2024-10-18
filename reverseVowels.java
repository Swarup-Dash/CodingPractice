public class reverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        String Vowels = "aeiouAEIOU";  // corrected to include 'U'

        char[] ch = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
        }

        int left = 0, right = s.length() - 1;
        while (left < right) {
            // Use String.valueOf() to convert char to string for contains() check
            if (!Vowels.contains(String.valueOf(ch[left]))) {
                left++;
                continue;
            }
            if (!Vowels.contains(String.valueOf(ch[right]))) {
                right--;
                continue;
            }

            // Swap the vowels
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        // Convert the char array back to a string and print the result
        System.out.println(new String(ch));
    }
}
