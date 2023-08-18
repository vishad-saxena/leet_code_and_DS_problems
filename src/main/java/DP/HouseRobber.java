package DP;

//HOUSE ROBBER-1
//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them
// is that adjacent houses have security systems connected and it will automatically contact the police
// if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.

//HOUSEROBBER-2
//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
// That means the first house is the neighbor of the last one.
// Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police
// if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.


public class HouseRobber {
    public static void main(String[] args) {
        int [] nums={20,5,1,13,6,11,40};
//        HOUSE ROBBER-1
        int maxAmout=getHelper(nums,0, nums.length);
        System.out.println(maxAmout);
//        NOW HOUSE ROBBER-2
        int maxPossibleAmout=Math.max(getHelper(nums,0, nums.length-1),getHelper(nums,1, nums.length));
        System.out.println(maxPossibleAmout);

    }

    private static int getHelper(int[] nums,int start,int end) {
        int max=0;
        int rob=0;
        int notRob=0;
        for (int i = start; i < end; i++) {
            max=Math.max(nums[i]+rob,notRob);
            rob=notRob;
            notRob=max;
        }
        return max;
    }
}
