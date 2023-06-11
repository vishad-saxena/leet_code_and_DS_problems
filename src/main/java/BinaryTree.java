import java.util.*;

public class BinaryTree {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr={1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
        int i=0;
        Node root=null;
         root=getBinaryTree();
        System.out.println(root);
        preOrderTraversal(root);
        System.out.println(" ");
        System.out.println("in Order ");
        inOrderTraversal(root);
        System.out.println("");
        System.out.println("Post order");
        postOrderTraversal(root);
        System.out.println("");
        System.out.println("levelorder Traversal");
        List<List<Integer>> l=levelOrderTraversal(root);
        System.out.println(l);
        System.out.println("Iterative level order traversal");
        List<List<Integer>> itrList=getIterativeLevelTraversal(root);
        System.out.println(itrList);
    }

    private static List<List<Integer>> getIterativeLevelTraversal(Node root) {
        List<List<Integer>> finalList=new ArrayList<>();
        if (root==null)return null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list=new LinkedList<>();
            int count =queue.size();
            for (int i = 0; i < count; i++) {
                Node node=queue.poll();
                list.add(node.val);
                if (node.left!=null)queue.add(node.left);
                if (node.right!=null)queue.add(node.right);
            }
            finalList.add(list);
        }
        return finalList;
    }

    public static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>> list=new ArrayList<>();
        return getHelper(root,list,0);
    }
    public static List<List<Integer>> getHelper(Node root,List<List<Integer>> list,int level){
        if (root==null)return null;
        if (level>= list.size()){
            List<Integer> l1=new LinkedList<>();
            list.add(l1);
        }
        list.get(level).add(root.val);
        getHelper(root.left,list,level+1);
        getHelper(root.right,list,level+1);
        return list;
    }


    //    NLR
    public static void preOrderTraversal(Node root){
        if (root==null)return;
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
//    LNR
    public static void inOrderTraversal(Node root){
        if (root==null)return;
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);

    }
//    LRN
    public static void postOrderTraversal(Node root){
        if (root==null)return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }

    public static Node getBinaryTree(){
        Node root=null;
        System.out.println("enter data");
        int data=sc.nextInt();
        if (data==-1)return null;
        root=new Node(data);
        System.out.println("enter left data for "+data);
        root.left=getBinaryTree();
        System.out.println("enter right data for "+data);
        root.right=getBinaryTree();
        return root;
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


//    private static void preOrderTraversal(Node root) {
//        if (root==null)return;
//        System.out.println(root.val);
//        preOrderTraversal(root.left);
//        preOrderTraversal(root.right);
//    }
//
//    private static Node getBinaryTree() {
//        Node root=null;
//        System.out.println("Enter data");
//        int data=sc.nextInt();
//        if (data==-1) return null;
//        root=new Node(data);
//        System.out.println("enter data to left for "+ data);
//        root.left=getBinaryTree();
//        System.out.println("enter data to right for "+data);
//        root.right=getBinaryTree();
//        return root;
//    }
//
//static class Node{
//    int val;
//    Node left;
//    Node right;
//    Node(int val){this.val=val;}
//}