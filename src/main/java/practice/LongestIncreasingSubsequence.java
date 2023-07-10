package practice;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        int[] dp=new int[nums.length];
        dp[0]=1;
        int ans=0;
        for (int i = 1; i < nums.length; i++) {
            int len=0;
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]){
                    len= Math.max(len,dp[j]);
                }
            }
            dp[i]=1+len;
            ans=Math.max(dp[i],ans);
        }
        System.out.println(ans);
    }
}
