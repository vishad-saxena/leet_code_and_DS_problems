package practice;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
        int start=0;
        int end =nums.length-1;
        int min=Integer.MAX_VALUE;
        while (start<end){
            int mid=start+(end-start)/2;
            min=Math.min(nums[mid],min);
            if (nums[mid]<nums[end]){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        System.out.println(min);

    }
}
