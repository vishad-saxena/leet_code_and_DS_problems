public class Java4 {

    public static void main(String[] args) {
        Node list=new Node();
        list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
//         Node root=getReversed(list.head);
    }

//    1-2-3-4-5

//    private static Node getReversed(Node list) {
//        Node ptr=null;
////        if (list==null)return ;
//        if (list!=null) {
//            ptr = getReversed(list.next);
//        }
//        list=ptr;
//            return list;
//    }

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        Node(){
        }
        Node head;
        Node tail;
        Node add(int val){
            Node node=new Node(val);
            if (head==null){
                head=node;
                tail=node;
                return node;
            }
            tail.next=node;
            tail= tail.next;
            return node;
        }
    }
}
