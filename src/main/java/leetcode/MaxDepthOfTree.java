package leetcode;

public class MaxDepthOfTree {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Node root=getBinaryTree(arr,0,arr.length-1);
        int depth=getDepthOfBST(root);
        System.out.println(depth);
    }

    private static int getDepthOfBST(Node root) {
        int left=0;
        int right=0;
        if (root==null)return 0;
        if (root.left==null && root.right==null) return 1;
        left=getDepthOfBST(root.left);
        right=getDepthOfBST(root.right);
        return Math.max(left,right)+1;
    }

    private static Node getBinaryTree(int[] arr,int low,int high) {
        if (arr.length==0)return null;
        if (low>high)return null;
        int mid=low+(high-low)/2;
        Node node=new Node(arr[mid]);
        node.left=getBinaryTree(arr,low,mid-1);
        node.right=getBinaryTree(arr,mid+1,high);
        return node;
    }

    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
}
