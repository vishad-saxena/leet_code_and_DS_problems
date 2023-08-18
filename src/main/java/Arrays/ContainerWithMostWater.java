package Arrays;


//You are given an integer array height of length n.
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights={1,8,6,2,5,4,8,3,7};
        int ans=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int currentVol=(Math.min(heights[left],heights[right]))*(right-left);
            ans=Math.max(ans,currentVol);
            if (heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(ans);
    }
}
