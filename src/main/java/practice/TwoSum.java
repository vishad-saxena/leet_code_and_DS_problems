package practice;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int[]res=getIndices(nums,9);
    }

    private static int[] getIndices(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
