public class AddSpaces{
    public static String addspace(String s, int[] nums){
        StringBuilder res = new StringBuilder();
        int prev = 0;
        for(int i=0; i<nums.length;i++){
            res.append(s.substring(prev, nums[i]));
            res.append(" ");
            prev=nums[i];
        }
        res.append(s.substring(prev));
        
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "EnjoyYourLife";
        int[] nums = {5, 9};
        String result = addspace(s, nums);
        System.out.println(result);
    }
}