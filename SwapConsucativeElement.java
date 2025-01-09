import java.util.Arrays;

public class SwapConsucativeElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 9, 7, 6, 3};
        for(int i=0; i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp; 
        }
        System.out.println(Arrays.toString(arr));
    }
}
