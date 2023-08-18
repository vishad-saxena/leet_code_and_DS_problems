package Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
//        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={5,4,-1,7,8};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            max=Math.max(sum,max);
            if (sum<0)sum=0;
        }
        System.out.println(max);
    }
}
