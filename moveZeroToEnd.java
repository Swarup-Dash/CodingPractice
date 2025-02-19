public class moveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        // int temp = 0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         } 
        //     }
        // } 

        // for(int num:arr){
        //     System.out.print(num+" "); //0 0 0 1 2 3 4 5 
        // }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count < arr.length){
            arr[count++] = 0;
        }
        for(int num:arr){
            System.out.print(num+" "); 
        }
            
    }
}
