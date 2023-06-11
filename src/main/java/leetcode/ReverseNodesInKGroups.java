package leetcode;

public class ReverseNodesInKGroups {
    Node head;
    Node tail;
    public Node addNode(int val){
        Node node =new Node(val);
        if (head==null){
            head=node;
            tail=node;
            return head;
        }
        tail.next=node;
        tail=tail.next;
        return tail;
    }

    public static void main(String[] args) {
        ReverseNodesInKGroups nodeList=new ReverseNodesInKGroups();
        nodeList.addNode(1);
        nodeList.addNode(2);
        nodeList.addNode(3);
        nodeList.addNode(4);
        nodeList.addNode(5);

        Node reverseNodeList=getReverseNodeListInKGroups(nodeList.head,2);
    }

    private static Node getReverseNodeListInKGroups(Node head,int k) {
        if (head==null||k==1)return head;
        int count =k;
        Node curr=head;
        while (curr!=null && count!=0){
            count--;
            curr=curr.next;
        }
        if (count>0)return head;
        Node prev=getReverseNodeListInKGroups(curr,k);
        Node currentHead=head;
        for (int i = 0; i < k; i++) {
            Node next=currentHead.next;
            currentHead.next=prev;
            prev=currentHead;
            currentHead=next;
        }
        return prev;

    }


}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}