package leetcode;

public class HouseRobber1 {
    public static void main(String[] args) {
//        int [] nums={2,7,9,3,1};
        int [] nums={20,5,1,13,6,40};
        int result=getMaximumProfit(nums);
        System.out.println(result);
    }

    private static int getMaximumProfit(int[] nums) {
        if (nums.length==0)return 0;
        if (nums.length==1)return nums[0];
        if (nums.length==2)return Math.max(nums[0],nums[1]);
        int[]dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];
    }
}
