import java.util.Arrays;

public class SecondSmallest{
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 6, 9, 7, 10};
        int res = secondSm(arr);
        System.out.println(res); 

    }
    public static int secondSm(int[] arr){

        for(int i=0; i<arr.length;i++){
            int temp = 0;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        return arr[1];
    }
}
