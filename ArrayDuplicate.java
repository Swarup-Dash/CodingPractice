// import java.util.HashSet;

public class ArrayDuplicate{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 3};
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }

        }
        // HashSet<Integer> duplicate = new HashSet<>();
        // for(int ele: arr){
        //     if(!duplicate.add(ele)){
        //         System.out.println(ele);
        //     }
        // }
    }
}