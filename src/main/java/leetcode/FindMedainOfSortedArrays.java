package leetcode;

public class FindMedainOfSortedArrays {
    public static void main(String[] args) {
        int arr[]={1,2};
        int arr1[]={3,4};
        System.out.println(FindMedainOfSortedArrays.getMedianOfSortedArrays(arr,arr1));
    }

    private static double getMedianOfSortedArrays(int[] arr, int[] arr1) {
        int m=arr.length;
        int n=arr1.length;
        int [] resultArray=new int[m+n];
        int count=0;
        for (int i = 0; i < m+n; i++) {
            if (i<m){
                resultArray[i]=arr[i];
            }else {
                resultArray[i]=arr1[count];
                count++;
            }
        }
        for (int j = 0; j < resultArray.length; j++) {
            for (int k = j+1; k < resultArray.length; k++) {
                if (resultArray[j]>resultArray[k]){
                    int temp=resultArray[j];
                    resultArray[j]=resultArray[k];
                    resultArray[k]=temp;
                }
            }
        }

        int med1;
        double medianVal=0;
        if (resultArray.length%2==0){
            med1=(resultArray.length)/2;
            medianVal=(resultArray[(med1-1)]+resultArray[med1])/2.0;
        }else {
            med1=(resultArray.length+1)/2;
            medianVal=resultArray[med1-1];
        }
        return medianVal;
    }
}
