package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class BST {
    static int nodeIndex = 0;
    static int ansRangeSum = 0;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7,8};
//        1. createBSTFromSOrtedArray
        Node root=createBSTFromSOrtedArray(arr,0,arr.length-1);
//        Node root2=createBSTFromSOrtedArray(arr2,0,arr2.length-1);
//        2. print preorder traversal form BST
//        getPreOrderTraversal(root);
//        3. create preorderTraversalArray from BST
//        int[] preOrderArray = {4,2,1,3,6,5,7};
//        Node rootPreOrder = createBSTFromPreOrderTraversalArray(preOrderArray, Integer.MIN_VALUE, Integer.MAX_VALUE);
//        4. find range sum
//        int ans=findRangeSum(rootPreOrder,7,10);
//        5. SameTree
//        boolean isSame=areTwoTreeSame(root,root2);
//        6. Level order traversal of BST along with implementation of FlatMap in java8
//        List<List<Integer>> list=levelOrderTraversal(root);
//        System.out.println(list.stream().flatMap(e->e.stream()).collect(Collectors.toList()));
//        7. MaxDepth of a BST
//        int maxDepthBST=getMaxDepthOfBST(root);
//        8. invert /Flip the BST
        Node node=invertBST(root);

    }

    private static Node invertBST(Node root) {
        if (root.left==null && root.right==null){
            return root;
        }
        Node left=invertBST(root.left);
        Node right=invertBST(root.right);
        Node temp=left;
        root.left=right;
        root.right=temp;
        return root;
    }


//    private static int getMaxDepthOfBST(Node root) {
//        if (root==null)return 0;
//        if (root.left==null && root.right==null)return 1;
//        int left=getMaxDepthOfBST(root.left);
//        int right=getMaxDepthOfBST(root.right);
//        return Math.max(left,right)+1;
//    }


    private static boolean areTwoTreeSame(Node root, Node root1) {
        if (root==null && root1==null)return true;
        if (root==null || root1==null)return false;
        if (root.val!=root1.val)return false;
        boolean left=areTwoTreeSame(root.left,root1.left);
        boolean right=areTwoTreeSame(root.right,root1.right);
        return left&&right;
    }

    private static int findRangeSum(Node rootPreOrder, int L, int R) {
        if (rootPreOrder==null)return 0;
        helperRangeSum(rootPreOrder,L,R);
        return ansRangeSum;

    }

    private static void helperRangeSum(Node rootPreOrder, int l, int r) {
        if (rootPreOrder!=null) {
            if (l <= rootPreOrder.val && rootPreOrder.val <= r) {
                ansRangeSum += rootPreOrder.val;
            }
            if (l < rootPreOrder.val) {
                helperRangeSum(rootPreOrder.left, l, r);
            }
            if (rootPreOrder.val < r) {
                helperRangeSum(rootPreOrder.right, l, r);
            }
        }
    }

    private static Node createBSTFromPreOrderTraversalArray(int[] preOrderArray, int start, int end) {
        if (preOrderArray.length == 0) return null;
        if (nodeIndex > preOrderArray.length - 1 || preOrderArray[nodeIndex] < start || preOrderArray[nodeIndex] > end)
            return null;
        Node node = new Node(preOrderArray[nodeIndex++]);
        node.left = createBSTFromPreOrderTraversalArray(preOrderArray, start, node.val);
        node.right = createBSTFromPreOrderTraversalArray(preOrderArray, node.val, end);
        return node;
    }


    private static void getPreOrderTraversal(Node root) {
        if (root == null) return;
        System.out.println(root.val);
        getPreOrderTraversal(root.left);
        getPreOrderTraversal(root.right);
    }

    private static Node createBSTFromSOrtedArray(int[] arr, int low, int high) {
        if (arr.length == 0) return null;
        if (low > high) return null;
        int mid = low + (high - low) / 2;
        Node node = new Node(arr[mid]);
        node.left = createBSTFromSOrtedArray(arr, low, mid - 1);
        node.right = createBSTFromSOrtedArray(arr, mid + 1, high);
        return node;
    }
    private static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>> traversal=new ArrayList<>();
        if (root==null)return traversal;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int sizeOfQueue=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            while (sizeOfQueue!=0){
                Node node=queue.poll();
                currentLevel.add(node.val);
                if (node.left!=null)queue.add(node.left);
                if (node.right!=null)queue.add(node.right);
                sizeOfQueue--;
            }
            traversal.add(currentLevel);
        }
        return traversal;

    }
}

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
}

