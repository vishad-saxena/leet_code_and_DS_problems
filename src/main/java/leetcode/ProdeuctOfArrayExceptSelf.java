package leetcode;

public class ProdeuctOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
//        24,12,8,6
        int []pp=new int[nums.length];
        pp[0]=1;
        int sp=1;
        for (int i = 1; i < nums.length; i++) {
            pp[i]=pp[i-1]*nums[i-1];
        }

        for (int i = nums.length-1; i >=0; i--) {
            pp[i]=pp[i]*sp;
            sp=sp*nums[i];
        }
        for (int i:pp) {
            System.out.println(i);
        }

    }
}















//int[] pp=new int[nums.length];
//        pp[0]=1;
//        int[] sp=new int[nums.length];
//        sp[nums.length-1]=1;
//        for (int i = 1; i < nums.length; i++) {
//            pp[i]=pp[i-1]*nums[i-1];
//        }
//        for (int i = nums.length-2; i >= 0; i--) {
//            sp[i]=sp[i+1]*nums[i+1];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=pp[i]*sp[i];
//        }
//        for (Integer i:nums) {
//            System.out.println(i);
//        }