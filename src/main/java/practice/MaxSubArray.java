package practice;

import java.util.Arrays;

//Given an integer array nums, find the
//        subarray
//        with the largest sum, and return its sum.
public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        int res=getMaxSubArray(nums);
    }
//Second approach using sliding window
    private static int getMaxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        System.out.println(max);
        return 0;

    }
}


//int max=Integer.MIN_VALUE;
//        int sum=0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+=nums[i];
//            if (sum>max){
//                max=sum;
//            }
//            if (sum<0){
//                sum=0;
//            }
//
//        }
//        System.out.println(max);
//        return 0;