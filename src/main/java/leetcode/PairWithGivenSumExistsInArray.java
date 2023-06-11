package leetcode;

import java.util.Arrays;

public class PairWithGivenSumExistsInArray {
    public static void main(String[] args) {
        int n=18;
        int [] arr={1, 3, 45, 6, 10, 8};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int searchKey=n-arr[i];
            if (checkTwoSum(searchKey,arr,i+1,arr.length-1)==true){
                System.out.println("yes");
                break;
            }
        }
    }

    private static boolean checkTwoSum(int searchKey, int[] arr, int start, int end) {
        while (start<end) {
            int mid = (start + end) / 2;
            if (arr[mid] == searchKey)
                return true;
            else if (arr[mid] < searchKey)
                start = mid + 1;
            else end = mid - 1;

        }
        return false;
    }
}
