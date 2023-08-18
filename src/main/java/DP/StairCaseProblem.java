package DP;

//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class StairCaseProblem {
    public static void main(String[] args) {
        double ways= getNumberOfWays(20);
        System.out.println(ways);
    }

    private static int getNumberOfWays(int n) {
        if (n==0)return 0;
        int[] dp=new int[n];
        return getHelpForWays(n,0,dp);
    }

    private static int getHelpForWays(int n,int start,int[] dp) {
        if(start==n)return 1;
        if (start>n)return 0;
        if (dp[start]>0)return dp[start];
        dp[start]=getHelpForWays(n,start+1,dp)+getHelpForWays(n,start+2,dp);
        return dp[start];

    }

}
