//find the frequency of 1 in a sorted array of 0s and 1s in TC: LogN

public class Java16 {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1};
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==1){
                if(arr[mid-1]!=1){
                    break;
                }
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(arr.length-mid);
    }
}
