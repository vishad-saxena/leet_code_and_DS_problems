package leetcode;

public class OrderListWithAlternateNodes {
    static Node head;
    Node tail;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    Node add(int val){
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
//        INPUT: 1,2,3,4,5
//        OTPUT: 1,5,2,4,3
        OrderListWithAlternateNodes list=new OrderListWithAlternateNodes();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);



    }

}
