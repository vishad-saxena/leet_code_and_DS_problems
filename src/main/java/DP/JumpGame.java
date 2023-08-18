package DP;


//You are given an integer array nums. You are initially positioned at the array's first index,
// and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
public class JumpGame {
    public static void main(String[] args) {
//        int[] nums= {2,3,1,1,4};
        int[] nums= {3,2,1,0,4};
        int reachable=0;
        for (int i = 0; i < nums.length && i<=reachable; i++) {
            reachable=Math.max(reachable,i+nums[i]);
            if (reachable>= nums.length-1){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);

    }
}
