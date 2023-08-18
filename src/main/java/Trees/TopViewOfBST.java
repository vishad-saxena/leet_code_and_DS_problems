package Trees;

import java.util.*;

public class TopViewOfBST {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
//
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
//


        Node node=createBSTfromSortedArray(arr,0,arr.length-1);
//        List<Integer> topView=getTopViewOfBST(node);
        getRightViewOfBST(root);
//        Node root=addKthElentToTree(node,8);

    }

    private static Node addKthElentToTree(Node node, int k) {
        if (node==null)return new Node(k);
        if (k< node.val){
            node.left=addKthElentToTree(node.left,k);
        }
        if (k> node.val){
            node.right=addKthElentToTree(node.right,k);
        }
        return node;
    }

    private static List<Integer> getTopViewOfBST(Node node) {
        if(node==null)return null;
        List<Integer>list=new ArrayList<>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        Queue<Pair> queue=new ArrayDeque<>();
        queue.add(new Pair(0,node));
        while (!queue.isEmpty()){
            Pair p=queue.poll();
//            if (!map.containsKey(p.key)){
                map.put(p.key,p.node.val);
//            }
            if (p.node.left!=null)queue.add(new Pair(p.key-1,p.node.left));
            if (p.node.right!=null)queue.add(new Pair(p.key+1,p.node.right));
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
    private static void getRightViewOfBST(Node root){
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> queue=new ArrayDeque<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair pair=queue.poll();
            if (!map.containsKey(pair.key)){
                map.put(pair.key, pair.node.val);
            }
            if (pair.node.right!=null){
                queue.add(new Pair(pair.key+1,pair.node.right));
            }
            if (pair.node.left!=null){
                queue.add(new Pair(pair.key+1,pair.node.left));
            }

        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }


    }

    private static Node createBSTfromSortedArray(int[] arr,int start,int end) {
        if (arr.length==0)return null;
        int mid=start+(end-start)/2;
        if (start>end)return null;
        Node root=new Node(arr[mid]);
        root.left=createBSTfromSortedArray(arr,start,mid-1);
        root.right=createBSTfromSortedArray(arr,mid+1,end);
        return root;

    }
}
class Pair{
    int key;
    Node node;
    public Pair(int key,Node val){
        this.key=key;
        this.node=val;
    }
}

