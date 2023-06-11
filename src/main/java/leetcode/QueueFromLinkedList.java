package leetcode;

public class QueueFromLinkedList {
    Qnode front;
    Qnode rear;
    QueueFromLinkedList(){
        this.front=this.rear=null;
    }

    class Qnode{
        int val;
        Qnode next;
        Qnode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void enqueue(int val){
        Qnode node=new Qnode(val);
        if (rear==null){
            front=node;
            rear=node;
            return;
        }
        rear.next=node;
        rear=rear.next;
    }
    public void dequeue(){
        if (front==null)return;
        front= front.next;
        if (front==null){
            rear=null;
        }

    }

    public static void main(String[] args) {
        QueueFromLinkedList q=new QueueFromLinkedList();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);


    }
}
