import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n=4;
        int[][] result = spiralMatrixII(n);
        for (int[] ans : result) {
            System.out.println(Arrays.toString(ans));
        }
    }
    public static int[][] spiralMatrixII(int n){

        int[][] res = new int[n][n];

        int left = 0;
        int right = n-1;
        int top =0;
        int buttom = n-1;
        int num = 1;

          
        for(int i=left;i<=right;i++){
            res[top][i]=num++;
        }
        top++;

        for(int j=top;j<=buttom;j++){
            res[j][right]=num++;
        }
        right--;

        for(int i=right;i>=left;i--){
            res[buttom][i]=num++;
        }
        buttom--;

        for(int j=buttom; j>=top;j--){
            res[j][left]=num++;
        }
        left++;
        
        if(left<=right){
            res[left][right-1]=num++;
            left++;
            right++;
        }

        return res;
    }
}
