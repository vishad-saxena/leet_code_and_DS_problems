package practice;

import java.util.Arrays;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int[] arr={7,5,1};
        int n=18;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int result=getCoinChangeWays(n,arr,dp);
        if (result==Integer.MAX_VALUE){
            result=-1;
        }
        System.out.println(result);
    }

    private static int getCoinChangeWays(int n, int[] arr, int[] dp) {
        if (n == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                int subAns = 0;
                if (dp[n - arr[i]] != -1) {
                    subAns = dp[n - arr[i]];
                } else {
                    subAns = getCoinChangeWays(n - arr[i], arr, dp);
                }
                if (subAns!=Integer.MAX_VALUE && 1+subAns<ans){
                    ans=subAns+1;
                }
            }
        }
        return dp[n]=ans;
    }
}
