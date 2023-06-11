package leetcode;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arr1={1,3,2,5,6,4};
//        10,9,2,5,3,7,101,18    0,1,0,3,2,3  7,7,7,7,7,7,7,7
        System.out.println(getLISFromArray(arr1));
        System.out.println(getCommonSubsequenceFromTwoStrings(arr,arr1));
    }

    private static int getLISFromArray(int[] arr) {
        int ans=0;
        if (arr.length==1)return 1;
        int[] arr1=new int[arr.length];
        arr1[0]=1;
        for (int i=1;i<arr.length;i++){
            int len=0;
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]){
                    len=Math.max(len,arr1[j]);
                }
            }
            arr1[i]=1+len;
            ans=Math.max(ans,arr1[i]);
        }
        return ans;
    }

    private static int getCommonSubsequenceFromTwoStrings(int [] nums1,int [] nums2){
        int m= nums1.length;
        int n= nums2.length;
        int[][] temp=new int[m+1][n+1];
        for (int i=1;i< temp.length;i++){
            for (int j=1;j<temp[0].length;j++){
                if (nums1[i-1]==nums2[j-1]){
                    temp[i][j]=1+ temp[i-1][j-1];
                }else {
                    temp[i][j]=Math.max(temp[i-1][j],temp[i][j-1]);
                }
            }
        }
        return temp[m][n];
    }
}






//int ans=0;
//        int n=arr.length;
//        if (n==1)return 1;
//        int[] tempArr=new int[n];
//        tempArr[0]=1;
//        for (int i=1;i<n;i++){
//            int len=0;
//            for (int j = 0; j < i; j++) {
//                if (arr[j]<arr[i]){
//                    len=Math.max(len,tempArr[j]);
//                }
//            }
//            tempArr[i]=1+len;
//            ans=Math.max(ans,tempArr[i]);
//        }
//        return ans;


//int m=nums1.length;
//        int n=nums2.length;
//        int[][]tempArr=new int[m+1][n+1];
//        for (int i = 1; i < tempArr.length; i++) {
//            for (int j = 1; j < tempArr[0].length; j++) {
//                if (nums1[i-1]==nums2[j-1]){
//                    tempArr[i][j]=1+tempArr[i-1][j-1];
//                }else {
//                    tempArr[i][j]=Math.max(tempArr[i-1][j],tempArr[i][j-1]);
//                }
//            }
//        }
//        return tempArr[nums1.length][nums2.length];