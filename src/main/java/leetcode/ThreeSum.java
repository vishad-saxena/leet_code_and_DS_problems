package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={1,-1,-1,0};
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (i==0||(i>0&& arr[i]!=arr[i-1])) {
                int left = i + 1;
                int right = arr.length - 1;
                int sum = 0 - arr[i];
                while (left < right) {
                    if (arr[left] + arr[right] == sum) {
                        list.add(Arrays.asList(arr[i], arr[left], arr[right]));
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (arr[left] + arr[right] > sum) {
                        right--;
                    } else left++;
                }
            }
        }
        System.out.println(list);
    }
}
