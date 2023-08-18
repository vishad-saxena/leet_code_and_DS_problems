package Strings;


//Given a string s, find the length of the longest
//substring
// without repeating characters.


public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
//        String s="abcabcbb";
        String s="pwwkew";
        int length=0;
        String test="";
        for (int i = 0; i < s.length(); i++) {
            if (test.contains(String.valueOf(s.charAt(i)))){
                test=test.substring(test.indexOf(s.charAt(i))+1);
            }
            test=test+s.charAt(i);
            length=Math.max(length,test.length());
        }
        System.out.println(length);
    }
}
