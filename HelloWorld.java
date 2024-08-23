import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 6, 8}; 
        int[] result = removeDuplicate(arr); 
        
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] removeDuplicate(int[] arr) {
        int i = 0;
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
    
        return Arrays.copyOfRange(arr, 0, i + 1);
    }
}
