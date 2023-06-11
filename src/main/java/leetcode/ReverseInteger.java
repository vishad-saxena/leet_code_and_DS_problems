package leetcode;

public class ReverseInteger {
    public static int getReverseInteger(int x){
        int y=x<0?x*-1:x;
        int rev=0;
        while(y!=0){
          int rem =y%10;
            if (rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && rem>7){
                return 0;
            }
            if (rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && rem<-8){
                return 0;
            }
            rev=(rev*10)+rem;
            y=y/10;
        }
        rev=x<0?rev*-1:rev;

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(getReverseInteger(1463847412));;
    }
}
