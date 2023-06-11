package leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
//        int arr[]={7,1,5,3,6,4};
        int i=0;
        int sum=0;
        for (int j=1;j<arr.length;j++) {
            if (arr[j]>arr[i]){
                sum=Math.max(sum,arr[j]-arr[i]);
            }else {
                i=j;
            }
        }
        System.out.println(sum);
    }
}
