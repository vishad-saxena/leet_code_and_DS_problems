package leetcode;


public class HouseRobber2 {
    public static void main(String[] args) {
//        int[] nums={1,2,3,1};
        int [] nums={20,5,1,13,6,11,40};
//        int[] nums={2,7,9,3,1};
        int result=getMaxProfitFromRobbery(nums);
        System.out.println(result);
    }

    private static int getMaxProfitFromRobbery(int[] nums) {
        if (nums.length==0)return 0;
        if (nums.length==1)return nums[0];
        if (nums.length==2)return Math.max(nums[0],nums[1]);
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }

//    private static int helper(int[] nums, int start, int end) {
//        int[] dp=new int[nums.length];
//        dp[start]=nums[start];
//        dp[start+1]=Math.max(nums[start+1],dp[start]);
//        for (int i = start+2; i <= end; i++) {
//            dp[i]=Math.max((nums[i]+dp[i-2]),dp[i-1]);
//        }
//        return dp[end];
//    }
//    Second approach with O(1) space complexity using DP
private static int helper(int[] nums, int start, int end) {
    int max=0;
    int rob=0;
    int notRob=0;
    for (int i = start; i <= end; i++) {
        max=Math.max((nums[i]+rob),notRob);
        rob=notRob;
        notRob=max;
    }
    return max;
}
}
