package practice;

public class JumpGame {
    public static void main(String[] args) {
        int [] nums ={2,3,1,1,4};
        int reachable=0;
        for (int i = 0; i < nums.length &&i<=reachable; i++) {
            reachable=Math.max(reachable,i+nums[i]);
            if (reachable>= nums.length-1){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }
}
