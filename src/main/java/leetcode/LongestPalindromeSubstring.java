package leetcode;

public class LongestPalindromeSubstring {
    public static String longestPalindrome(String s) {
        if (s.length()<=1)return s;
        int max_length=1;
        int st = 0,end=0;
        int size=s.length();
//        for odd
        for (int i = 0; i < size-1; i++) {
            int l=i,r=i;
            while(l>=0&&r<size){
                if (s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }else break;
            }
            int length=r-l-1;
            if (length>max_length){
                max_length=length;
                st=l+1;
                end=r-1;
            }
        }
//        for even
        for (int i = 0; i < size-1; i++) {
            int l=i,r=i+1;
            while (l>=0&&r<size){
                if (s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                else break;
            }
            int length=r-l-1;
            if (length>max_length){
             max_length=length;
             st=l+1;
             end=r-1;
            }
        }
        return s.substring(st,end+1);
    }

    public static void main(String[] args) {
        System.out.println(LongestPalindromeSubstring.longestPalindrome("babad"));
    }
}
