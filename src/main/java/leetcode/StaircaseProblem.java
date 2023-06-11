package leetcode;

public class StaircaseProblem {
    public static void main(String[] args) {
        System.out.println(getNumberOfWaysToclimbStairs(5));
    }
    public static int getNumberOfWaysToclimbStairs(int n){
        int[] arr=new int[n];
        return helper(arr,0,n);

    }
    public static int helper(int[] arr,int i,int n){
        if (i>n)return 0;
        if (i==n)return 1;
        if (arr[i]>0)return arr[i];
        arr[i]=helper(arr,i+1,n)+helper(arr,i+2,n);
        return arr[i];
    }

}










// private static int getNumberOfWaysToclimbStairs(int n) {
//       int [] arr=new int[n];
//       return helper(0,n,arr);
//    }
//
//    private static int helper(int i, int n, int[] arr) {
//       if (i>n)
//           return 0;
//       if (i==n)
//           return 1;
//       if (arr[i]>0)
//           return arr[i];
//       arr[i]=helper(i+1,n,arr)+helper(i+2,n,arr);
//       return arr[i];
//    }