package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        boolean res=wordBreak("applepenapple", Arrays.asList("apple","pen"));
        System.out.println(res);
    }
    public static boolean wordBreak(String s, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        boolean[]dp=new boolean[s.length()+1];
        dp[0]=true;
        for (int i = 1; i <=s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String suffix=s.substring(j,i);
                if (set.contains(suffix)&&dp[j]==true){
                    dp[i]=true;
                    break;
                }
            }

        }
        return dp[s.length()];
    }
}
