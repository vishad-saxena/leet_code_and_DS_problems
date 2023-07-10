package practice;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[]nums1={1,2,2,3,4,0,0,0,0,0};
        int[]nums2={1,2,2,3,4};
        int m=5;
        int n=nums2.length;
        mergeTwoSortedArray(nums1,m,nums2,n);
    }

    private static void mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        for (int i = nums1.length-1; i >=0; i--) {
            int valAtP1=p1>=0?nums1[p1]:Integer.MIN_VALUE;
            int valAtp2=p2>=0?nums2[p2]:Integer.MIN_VALUE;
            if (valAtP1>=valAtp2){
                nums1[i]=valAtP1;
                p1--;
            }else {
                nums1[i]=valAtp2;
                p2--;
            }
        }
        System.out.println("check");

    }
}
