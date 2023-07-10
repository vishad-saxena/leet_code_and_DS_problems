package practice;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res=new int[nums.length];
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
//        int[] suffixProduct = new int[nums.length];
//        suffixProduct[nums.length - 1] = 1;
        int sp=1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }
        for (int i = nums.length-1; i >=0; i--) {
            prefixProduct[i]=prefixProduct[i]*sp;
            sp=sp*nums[i];
        }

//        for (int i = 0; i < nums.length; i++) {
//            res[i]=prefixProduct[i]*suffixProduct[i];
//        }

    }
}

// int[] nums = {1, 2, 3, 4};
//        int[] prefixProduct = new int[nums.length];
//        prefixProduct[0] = 1;
//        int[] suffixProduct = new int[nums.length];
//        suffixProduct[nums.length - 1] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
//        }
//        for (int i = nums.length-2; i >=0; i--) {
//            suffixProduct[i]=suffixProduct[i+1]*nums[i+1];
//        }
//        int[] res=new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            res[i]=prefixProduct[i]*suffixProduct[i];
//        }
