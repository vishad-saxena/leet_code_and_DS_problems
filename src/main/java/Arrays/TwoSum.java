package Arrays;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers
// such that they add up to target.
//
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//
//You can return the answer in any order.
public class TwoSum {
    public static void main(String[] args) {
//        int[] arr={2,7,11,15};
//        int[] arr={3,3};
        int[] arr={3,2,4};
        int target=6;
        int[] indices=twoSum(arr,target);
    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int component=target-arr[i];
            if (map.containsKey(component)){
                return new int[]{map.get(component),i};
            }else {
                map.put(arr[i],i);
            }
        }
        return new int[]{};

    }
}
