package practice;

public class BuyAndSellSTock {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int i=0;
        int profit=0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[i]<nums[j]){
//                profit=Math.max(profit,nums[j]- nums[i]);
//            }else{
//                i=j;
//            }
//        }
//        System.out.println(profit);
        getMaxProfitByBuyingAndSellingStock(nums);
    }
    private static void getMaxProfitByBuyingAndSellingStock(int[] nums){
        int maxProfit=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[i-1]){
                maxProfit+=(nums[i]-nums[i-1]);
            }
        }
        System.out.println(maxProfit);
    }
}
