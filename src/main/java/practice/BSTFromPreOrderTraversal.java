package practice;

public class BSTFromPreOrderTraversal {
    static int nodeIndex=0;
    public static void main(String[] args) {
        int [] nums={8,5,1,7,10,12};
        Node root=getBSTFromPreOrderTraversal(nums);
    }

    private static Node getBSTFromPreOrderTraversal(int[] nums) {
        if (nums.length==0)return null;
        return getBST(nums,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static Node getBST(int[] nums, int minValue, int maxValue) {
        if (nodeIndex==nums.length ||nums[nodeIndex]<minValue || nums[nodeIndex]>maxValue)return null;
        int val=nums[nodeIndex++];
        Node node=new Node(val);
        node.left=getBST(nums,minValue,node.val);
        node.right=getBST(nums,node.val,maxValue);
        return node;
    }
}
