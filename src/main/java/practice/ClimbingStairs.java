package practice;

public class ClimbingStairs {
    public static void main(String[] args) {
        int[] dp = new int[5];
        int waysToClimbStairs = getHelper(0, 5, dp);
    }

    private static int getHelper(int i, int n, int[] dp) {
        if (i > n) return 0;
        if (i == n) return 1;
        if (dp[i] > 0) {
            return dp[i];
        }
        dp[i] =getHelper(i+1,n,dp)+getHelper(i+2,n,dp);
        return dp[i];
    }
}
