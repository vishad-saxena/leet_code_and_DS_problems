package leetcode;

import java.util.*;

public class TopViewOfBinarySearchTree {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        Node root=getBstFromArray(arr,0,arr.length-1);
        System.out.println(root.val);
        List<Integer> list=getTopViewOfBST(root);
    }

    private static List<Integer> getTopViewOfBST(Node root) {
        List<Integer> list=new ArrayList<>();
        if (root==null) return null;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new ArrayDeque<Pair>();
        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair pair=q.poll();
//            if (!map.containsKey(pair.val)){
                map.put(pair.val,pair.node.val);
//            }
            if (pair.node.left!=null)
                q.add(new Pair(pair.val-1,pair.node.left ));
            if (pair.node.right!=null)
                q.add(new Pair(pair.val+1, pair.node.right));
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }



    private static Node getBstFromArray(int[] arr, int low, int high) {
        if (arr.length==0)return null;
        if (low>high)return null;
        int mid=low+(high-low)/2;
        Node node=new Node(arr[mid]);
        node.left=getBstFromArray(arr,low,mid-1);
        node.right=getBstFromArray(arr,mid+1,high);
        return node;
    }

    static class  Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    static class Pair{
        int val;
        Node node;
        Pair(int val,Node node){
            this.val=val;
            this.node=node;
        }
    }

}
