package Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
//        int[] nums={1, -2, -3, 0, 7, -8, -2};
        int[] nums={2,3,-2,4};
        int product=1;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            product*=nums[i];
            max=Math.max(max,product);
            if (nums[i]==0){
                product=1;
            }
        }
        product=1;
        for (int j =nums.length-1; j >=0; j--) {
            product*=nums[j];
            max=Math.max(max,product);
            if (nums[j]==0)product=1;
        }
        System.out.println(max);
    }
}
