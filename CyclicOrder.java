public class CyclicOrder {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "d";
        boolean result = cyclicOrder(str1, str2);
        System.out.println(result); 
    }

    public static boolean cyclicOrder(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            // Check direct match or cyclic shift
            if (str1.charAt(i) == str2.charAt(j) || 
                (char) (((str1.charAt(i) - 'a' + 1) % 26) + 'a') == str2.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == str2.length();
    }
}
