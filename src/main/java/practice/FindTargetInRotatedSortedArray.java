package practice;

public class FindTargetInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[]={5,6,7,0,1,2,4};
        int k=4;
        int index=getIndexOfTargetValueinInArray(nums,k);
        System.out.println(index);


    }

    private static int getIndexOfTargetValueinInArray(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[start]<=nums[mid]){
                if (target>=nums[start]&& target<nums[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (nums[mid]<target && target<=nums[end]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
