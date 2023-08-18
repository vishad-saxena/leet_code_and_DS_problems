package DP;

//Given two strings text1 and text2, return the length of their longest common subsequence.
// If there is no common subsequence, return 0.
//
//A subsequence of a string is a new string generated from the original string
// with some characters (can be none) deleted without changing the relative order of the remaining characters.
//For example, "ace" is a subsequence of "abcde".
//A common subsequence of two strings is a subsequence that is common to both strings.

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[text1.length()][text2.length()]);
    }

}
