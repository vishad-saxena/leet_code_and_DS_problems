package DP;

//You are given an integer array coins representing coins of different denominations and an integer amount
// representing a total amount of money.
//
//Return the fewest number of coins that you need to make up that amount.
// If that amount of money cannot be made up by any combination of the coins, return -1.
//
//You may assume that you have an infinite number of each kind of coin.
public class CoinChangeProblem {
    public static void main(String[] args) {

        int[] arr={7,5,1};
        int n=18;
        int[]dp=new int[n+1];

        int number=getMin(n,arr,dp);
        System.out.println(number);
    }
    static int getMin(int n,int[] a,int[]dp){
        if (n==0)return 0;
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (n-a[i]>=0){
                int subAns;
                if (dp[n-a[i]]!=0){
                    subAns=dp[n-a[i]];
                }else {
                    subAns=getMin(n-a[i],a,dp);
                }
                if (subAns!=Integer.MAX_VALUE && 1+subAns<ans){
                    ans=1+subAns;
                }
            }
        }
        dp[n]=ans;
        return dp[n];

    }

}
