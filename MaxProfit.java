public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int result = stockmaxProfit(arr);
        System.out.println("Maximun profit: "+ result);
    }

    public static int stockmaxProfit(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;
    }
}
