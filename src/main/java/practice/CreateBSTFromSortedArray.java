package practice;

public class CreateBSTFromSortedArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        Node resBST=getBSTFromArray(arr,0,arr.length-1);

    }

    private static Node getBSTFromArray(int[] arr,int low,int high) {
        if(arr.length==0){
            return null;
        }
        if (low>high)return null;
        int mid=low+(high-low)/2;
        Node node=new Node(arr[mid]);
        node.left=getBSTFromArray(arr,low,mid-1);
        node.right=getBSTFromArray(arr,mid+1,high);
        return node;
    }
}
class Node{
    int val;
    Node right;
    Node left;
    public Node(int val){
        this.val=val;
    }
}
