package practice;

//Given an integer array nums, find a
//subarray
// that has the largest product, and return the product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.
public class MaxProductSubArray {
    public static void main(String[] args) {
        int nums[] ={2,3,-2,4};
        int product=1;
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            product*=nums[i];
            ans=Math.max(product,ans);
            if (nums[i]==0){
                product=1;
            }
        }
        product=1;
        for (int i = nums.length-1; i >=0 ; i--) {
            product*=nums[i];
            ans=Math.max(product,ans);
            if (nums[i]==0){
                product=1;
            }
        }
        System.out.println(ans);
    }
}
