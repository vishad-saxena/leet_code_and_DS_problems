package leetcode;

import java.util.HashSet;
import java.util.Stack;

public class CustomLinkedList {
    Node header=null;
    Node current=null;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public boolean add(int val){
        Node node=new Node(val);
        if (header==null){
            header=node;
            current=header;
        }else{
            current.next=node;
            current=current.next;
        }
        return true;
    }
    public void displayList(){
        Node itr=header;
        while (itr!=null){
            System.out.println(itr.val);
            itr=itr.next;
        }
    }
    public boolean detectLoop(){
        HashSet<Node> s=new HashSet<>();
        Node itr=header;
        while (itr!=null){
            if (s.contains(itr)){
                return true;
            }
            s.add(itr);
            itr=itr.next;
        }
        return false;
    }
    public boolean isPalindrome(){
        Stack<Integer> stack=new Stack<>();
        boolean isPalind=true;
        Node curr=header;
        Node tempHeader=header;
        while(curr!=null){
            stack.push(curr.val);
            curr=curr.next;
        }
        while (tempHeader!=null){
            int t=stack.pop();
            if (t==tempHeader.val){
                tempHeader=tempHeader.next;
            }
            else {
                return false;
            }
        }
        return isPalind;
    }
    public int floydsCycleDetection(){
        Node slow_ptr=header;
        Node fast_ptr=header;
        while(slow_ptr!=null && fast_ptr!=null &&fast_ptr.next!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if (slow_ptr==fast_ptr){
                return countNodesInLoop(slow_ptr);
            }
        }
        return 0;

    }

    private int countNodesInLoop(Node slow_ptr) {
        int res=1;
        Node temp=slow_ptr;
        while (temp.next!=slow_ptr){
            res++;
            temp=temp.next;
        }
        return res;
    }

    public static void main(String[] args) {
        CustomLinkedList list=new CustomLinkedList();
        CustomLinkedList list1=new CustomLinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        list.removeDuplicatesUnsortedOrder();
//        list.removeDuplicatesAscendingOrder();
//        list.displayList();
//        getIntersectionOfTwoSortedList();
//        System.out.println(list.floydsCycleDetection());
//        System.out.println(list.isPalindrome());
//        list.sortListOf0s1s2s();
        list.reverseLinkedList();
        list.displayList();
//        list.deleteNodeWithoutHeadPointer(list.header.next.next.next.next);


    }
    public void reverseLinkedList(){
        Node ref=header;
        Node dummy=new Node(-1);
        Node ptr=dummy;
        Stack<Integer> s=new Stack<>();
        while (ref!=null){
            s.push(ref.val);
            ref=ref.next;
        }
        while(ptr!=null&& !s.isEmpty()){
            ptr.next=new Node(s.pop());
            ptr=ptr.next;
        }
        header=dummy.next;
    }
    private void deleteNodeWithoutHeadPointer(Node ref){
        if (ref.next!=null) {
            Node node = ref;
            Node temp = node.next;
            node.val = temp.val;
            node.next = temp.next;
        }

    }
    private void sortListOf0s1s2s(){
        Node ptr=this.header;
        int[] count=new int[3];
        while (ptr!=null){
            count[ptr.val]++;
            ptr=ptr.next;
        }
        int i=0;
        ptr=this.header;
        while (ptr!=null){
            if (count[i]==0){
                i++;
            }
            ptr.val=i;
            count[i]--;
            ptr=ptr.next;
        }
    }

    private static void getIntersectionOfTwoSortedList(CustomLinkedList list,CustomLinkedList list1) {
        Node dummy;
        Node tail;
        CustomLinkedList intersection=new CustomLinkedList();
        Node p=list.header;
        Node q=list1.header;
        while(p!=null && q!=null){
            if (p.val==q.val){
//                dummy=intersection.add(p.val);
            }
        }

    }

    private void removeDuplicatesUnsortedOrder() {
        Node ptr1=header;
        while(ptr1!=null && ptr1.next!=null){
            Node ptr2=ptr1;
            while (ptr2.next!=null) {
                if (ptr1.val == ptr2.next.val) {
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else {
                    ptr2=ptr2.next;
                }
            }
            ptr1=ptr1.next;
        }
    }

    private void removeDuplicatesAscendingOrder() {
        Node curr=header;

        while(curr!=null){
            Node temp=curr;
            while(temp!=null && temp.val==curr.val){
                temp=temp.next;
            }
            curr.next=temp;
            curr=temp;
        }
    }

}
