package leetcode;

public class StackfromLinkedList {
    Node front;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void push(int val){
        Node node=new Node(val);
        if (front==null){
            front=node;
            return;
        }
        node.next=front;
        front=node;
    }
    public Integer pop(){
        if (front==null)return null;
        Node temp=front;
        front= front.next;
        return temp.val;
    }

    public static void main(String[] args) {
        StackfromLinkedList s=new StackfromLinkedList();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
