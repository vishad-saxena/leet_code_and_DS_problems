package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertSortedArrayToBST {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node root=getBSTfromSortedArray(arr,0,arr.length-1);
        System.out.println("pre order traversal ");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("level order traversal");
        List<List<Integer>> finalList=levelOrderTraversal(root);
        System.out.println(finalList);
        System.out.println("zig-zag order level traversal");
        List<List<Integer>> zigzagList=zigZagOrderTraversal(root);
        System.out.println(zigzagList);
    }

    private static List<List<Integer>> zigZagOrderTraversal(Node root) {
        if (root==null)return null;
        List<List<Integer>> zigzagList=new ArrayList<>();
        return getZigZagOrderedList(root,zigzagList,0);
    }

    private static List<List<Integer>> getZigZagOrderedList(Node root, List<List<Integer>> zigzagList, int level) {
        if (root==null)return null;
        if (level>=zigzagList.size()){
            List<Integer> list=new LinkedList<>();
            zigzagList.add(list);
        }
        if (level%2==0)zigzagList.get(level).add(root.val);
        else zigzagList.get(level).add(0, root.val);
        getZigZagOrderedList(root.left,zigzagList,level+1);
        getZigZagOrderedList(root.right,zigzagList,level+1);
        return zigzagList;
    }

    private static void preOrderTraversal(Node root) {
        if (root==null)return;
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    private static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>> list=new ArrayList<>();
        getHelperLevelOrder(list,root,0);
        return list;
    }

    private static List<List<Integer>> getHelperLevelOrder(List<List<Integer>> list, Node root, int level) {
        if (root==null) return null;
        if (level>=list.size()){
            List<Integer> l1=new LinkedList<>();
            list.add(l1);
        }
        list.get(level).add(root.val);
        getHelperLevelOrder(list,root.left,level+1);
        getHelperLevelOrder(list,root.right,level+1);
        return list;
    }

    private static Node getBSTfromSortedArray(int[] arr, int low, int high) {
        if(arr.length==0)return null;
        if (low>high)return null;
        int mid=low+(high-low)/2;
        Node node=new Node(arr[mid]);
        node.left=getBSTfromSortedArray(arr,low,mid-1);
        node.right=getBSTfromSortedArray(arr,mid+1,high);
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
