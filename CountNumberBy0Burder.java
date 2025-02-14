public class CountNumberBy0Burder {
    public static int friendPair(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==0){
                    break;
                }
                else{
                    count++;
                }
            }   
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,2,0,5,6,0,6,7,7,0,3,4,0,5,3,0,2,9,4,0,4};

        System.out.println(friendPair(arr)+ " " + "Pairs");
    }

}
