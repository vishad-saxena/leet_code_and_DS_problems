//There is a linkedlist having random values in it. You need to write a program that will print the values in descending order. The disclaimers are -
//1) you should not use any pre-defined java libraries for sorting
//2) you should not take references from any of the sorting algorithms
//3) you need to implement linkedlist from scratch

public class Java1 {
    Node header;
    Node tail;

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
    public void addNode(int val){
        Node node=new Node(val);
        if (header==null){
            header=node;
            tail=node;
            return;
        }
        tail.next=node;
        tail=node;

    }
    public void display(){
        Node itr=header;
        while (itr!=null){
            System.out.println(itr.val);
            itr=itr.next;
        }
    }
    public static void main(String[] args) {
        Java1 ll=new Java1();
        ll.addNode(50);
        ll.addNode(-20);
        ll.addNode(30);
        ll.addNode(100);
        ll.addNode(-40);
        ll.addNode(0);
        ll.sort();
        ll.display();
    }

    private void sort() {
        Node itr=header;
        while (itr!=null){
            Node itr2=itr.next;
            while (itr2!=null){
                if (itr.val<itr2.val){
                    int temp;
                    temp=itr2.val;
                    itr2.val=itr.val;
                    itr.val=temp;
                }
                itr2=itr2.next;
            }
            itr=itr.next;
        }
    }
}
