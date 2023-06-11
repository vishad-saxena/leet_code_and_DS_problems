package leetcode;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int [] arr={2,3,-2,4};
        int sum=Integer.MIN_VALUE;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            max+=arr[i];
            sum=Math.max(max,sum);
            if (max<0){
                max=0;
            }
        }
        System.out.println(sum);
    }
}
