package leetcode;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        if(s.length()==1)return 1;
        int maxLen=0;
        String test="";
        for (int i = 0; i < s.length(); i++) {
            if (test.contains(String.valueOf(s.charAt(i)))){
                test=test.substring(test.indexOf(s.charAt(i))+1);
            }
            test+=String.valueOf(s.charAt(i));
            maxLen=Math.max(test.length(),maxLen);
        }

        return maxLen;





//        char[] arr=s.toCharArray();
//        int length=0;
//        for(int i=0;i<arr.length;i++){
//            String longestSubString="";
//            for(int j=i;j<arr.length;j++){
//                if(longestSubString.contains(String.valueOf(arr[j]))){
//                    break;
//                }
//                else {
//                    length=Math.max(length,j-i+1);
//                    longestSubString+=String.valueOf(arr[j]);
//                }
//            }
//        }
//        return length;

    }

    public static void main(String[] args) {
        System.out.println(LongestSubString.lengthOfLongestSubstring("abcabcbb"));
    }
}
