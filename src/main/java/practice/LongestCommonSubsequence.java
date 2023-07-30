package practice;

//Given two strings text1 and text2,
// return the length of their longest common subsequence.
// If there is no common subsequence, return 0.
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1="abcdef";
        String str2="def";
        int m=str1.length();
        int n=str2.length();
        int[][]dp=new int[m+1][n+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
