package leetcode;

public class SameTree {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7};
        int [] arr2={1,2,3,4,5,6,7,8};
        Node root=getBinaryTree(arr1,0,arr1.length-1);
        Node root2=getBinaryTree(arr2,0,arr2.length-1);
        System.out.println("");
         boolean bool=isSameBST(root,root2);
        System.out.println(bool);

    }

    private static boolean isSameBST(Node root, Node root2) {
        if (root==null && root2==null)return true;
        if (root!=null && root2!=null) return(root.val==root2.val && isSameBST(root.left,root2.left) && isSameBST(root.right,root2.right));
        return false;
    }

    private static Node getBinaryTree(int[] arr, int low, int high) {
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
