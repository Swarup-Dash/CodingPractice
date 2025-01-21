import java.util.ArrayList;
import java.util.List;

class SpiralMatrix{
    public static void main(String[] args) {
        int[][] nums = {{1,2,3}
                    ,{4,5,6},
                    {7,8,9}};
        List<Integer> result = spiralMatrix(nums);
        System.out.println(result);
    }
    public static List<Integer> spiralMatrix(int[][] nums){
        int left = 0;
        int right = nums.length-1;
        int top =0; 
        int buttom = nums.length-1;
        List<Integer> res = new ArrayList<>(); 

        for(int i=left; i<=right; i++){
            res.add(nums[top][i]);
        }
        top++;

        for(int j=top; j<=buttom;j++){
            res.add(nums[j][right]);
        }
        right--;

        for(int i=right; i>=left;i--){
            res.add(nums[buttom][i]);
        }
        buttom--;

        for(int j=buttom; j>=top;j--){
            res.add(nums[j][left]);
        }
        left++;

        return res;
    }
}