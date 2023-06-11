package leetcode;

public class RainWaterHarvesting {
    public static void main(String[] args) {
        int[] heights={7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
        System.out.println(getWaterAccumlatedOnRoofs(heights));
    }

    private static int getWaterAccumlatedOnRoofs(int[] heights) {
        int water=0;
        int left=0;
        int right =heights.length-1;
        int maxLeft=heights[left];
        int maxRight=heights[right];
        if (heights.length<=2)return 0;
        while (left<right){
            if (heights[left]<=heights[right]){
                left++;
                maxLeft=Math.max(maxLeft,heights[left]);
                water+=maxLeft-heights[left];
            }else {
                right--;
                maxRight=Math.max(maxRight,heights[right]);
                water+=maxRight-heights[right];
            }
        }
        return water;
    }
}
