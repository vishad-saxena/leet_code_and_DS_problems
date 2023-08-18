package DP;


//Given an integer array nums, return the length of the longest strictly increasing
//subsequence
//.
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
//        int[] seq={10,9,2,5,3,7,101,18};
//        int[] seq={7,7,7,7,7,7,7};
        int[] seq={0,1,0,3,2,3,1};
        int[] dp=new int[seq.length];
        int ans=0;
        dp[0]=1;
        for (int i = 1; i < seq.length; i++) {
            int len=0;
            for (int j = 0; j < i; j++) {
                if (seq[j]<seq[i]){
                    len=Math.max(len,dp[j]);
                }
            }
            len=1+len;
            dp[i]=len;
            ans=Math.max(ans,dp[i]);
        }
        System.out.println(ans);

    }
}
