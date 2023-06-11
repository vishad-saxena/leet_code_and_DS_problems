package leetcode;


public class ReverseLinkedListUsingRecursion {
    static Node newHead=null;
    Node head;
    Node tail;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public Node addNode(int val){
        Node node=new Node(val);
        if (head==null){
            head=node;
            tail=node;
            return head;
        }
        tail.next=node;
        tail=tail.next;
        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedListUsingRecursion list=new ReverseLinkedListUsingRecursion();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        Node node=getReversedList(list.head);
    }
    private static Node getReversedList(Node head) {
        if (head==null || head.next==null)return head;
        gerReverse(head);
        return newHead;
    }

    private static Node gerReverse(Node head) {
        if (head.next==null){
            newHead=head;
            return head;
        }
        Node temp=gerReverse(head.next);
        temp.next=head;
        head.next=null;
        return head;
    }


}


//===================one way of recursion to reverse=============
// public static void main(String[] args) {
//        ReverseLinkedListUsingRecursion list=new ReverseLinkedListUsingRecursion();
//        list.addNode(1);
//        list.addNode(2);
//        list.addNode(3);
//        list.addNode(4);
//        list.addNode(5);
//        list.addNode(6);
//        Node node=getReversedList(list.head);
//    }
//    private static Node getReversedList(Node head) {
//        if (head==null || head.next==null)return head;
//        gerReverse(head);
//        return newHead;
//    }
//
//    private static Node gerReverse(Node head) {
//        if (head.next==null){
//            newHead=head;
//            return head;
//        }
//        Node temp=gerReverse(head.next);
//        temp.next=head;
//        head.next=null;
//        return head;
//    }

//================second way to reverse a list recursion=====================
//       {
//     Node node=getReversedList(list.head,null);
//    }
//
//    private static Node getReversedList(Node head, Node nh) {
//        if (head==null)return nh;
//        Node nextNode=head.next;
//        head.next=nh;
//        return getReversedList(nextNode,head);
//    }