package leetcode;

public class IndexOfArrayMatchingTarget {

        public static int[] twoSum(int[] nums, int target) {
            int []res=new int[2];
            for(int i=0;i<nums.length;i++){
                    if(nums[i]+nums[i+1]==target){
                        res[0]=i;
                        res[1]=i+1;
                        break;
                }
            }

            return res;
        }

    public static void main(String[] args) {
            int [] nums={3,3};
        for (int i:twoSum(nums,6) ) {
            System.out.println(i);
        }
    }

}
