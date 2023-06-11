package leetcode;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7};
        int n= nums.length-1;
        for (int i = 0; i < 4; i++) {
            int temp=nums[n];;
            for (int j=n;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
        for (int num:nums) {
            System.out.println(num);
        }
    }
}
