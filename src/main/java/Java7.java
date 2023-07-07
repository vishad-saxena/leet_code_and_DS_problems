import java.util.Arrays;

public class Java7 {
    public static void main(String[] args) {
        int[] nums={4,-4,-4,4};
        int k=4;
        int result=getTotalOperations(nums,k);
        System.out.println(result);
    }

    public static int getTotalOperations(int[] nums, int k){
        int max=Integer.MIN_VALUE;
        int operations=0;

        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if ((max-nums[j])%k==0){
                operations+=(max-nums[j])/k;
            }else {
                return -1;
            }
        }

        return operations;
    }
}
