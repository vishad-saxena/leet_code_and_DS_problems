package Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[]pp=new int[nums.length];
        pp[0]=1;
        int sp=1;
        for (int i = 1; i < nums.length; i++) {
            pp[i]=pp[i-1]*nums[i-1];
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            pp[i]=pp[i]*sp;
            sp*=nums[i];
        }
        for (int i = 0; i < pp.length; i++) {
            System.out.println(pp[i]);
        }
    }
}
