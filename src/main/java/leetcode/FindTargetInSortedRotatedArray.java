package leetcode;

public class FindTargetInSortedRotatedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,1,2};
        System.out.println(getTargetValueIndex(nums,3));
        System.out.println(getPosOfTheMinValueSortedRotatedArray(nums));
    }

    private static int getTargetValueIndex(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==target)return mid;
            if (nums[start]<nums[mid]){
                if (nums[start]<=target && target<nums[mid]){
                    end=mid-1;
                }else start=mid+1;

            }else {
                if (nums[mid]<target && target<=nums[end]) start=mid+1;
                else end=mid-1;
            }

        }
        return -1;
    }
    private static int getPosOfTheMinValueSortedRotatedArray(int [] arr){
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            min=Math.min(arr[mid],min);
            if (arr[end]<arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return min;
    }
}





//int start=0;
//        int end =nums.length-1;
//        while (start<=end){
//            int mid=(start+end)/2;
//            if (nums[mid]==target){
//                return mid;
//            }
//            if (nums[start]<nums[mid]){
//                if (target>=nums[start]&& target<nums[mid]){
//                    end=mid-1;
//                }else {
//                    start=mid+1;
//                }
//            }else {
//                if (target>nums[mid]&& target<=nums[end]){
//                    start=mid+1;
//                }else {
//                    end=mid-1;
//                }
//            }
//        }



//int n=arr.length;
//        int min=Integer.MAX_VALUE;
//        if (n==1)return 1;
//        int start=0;
//        int end=n-1;
//        while(start<=end){
//            int mid=(start+end)/2;
//            min=Math.min(min,arr[mid]);
//            if (arr[end]<arr[mid]){
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        return min;