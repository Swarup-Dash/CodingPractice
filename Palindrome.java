public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,5,5,1};
        boolean isPalindrome = palindrome(arr);
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
    public static boolean palindrome(int[] arr){
        int left = arr[0];
        int right = arr[arr.length-1];

        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}