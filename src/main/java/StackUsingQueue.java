import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//Implementing stack using queue
public class StackUsingQueue {
    Queue<Integer> queue1=new ArrayDeque<>();
    Queue<Integer>queue2=new ArrayDeque<>();
    public void push(int num){
        queue2.add(num);
        while (!queue1.isEmpty()){
            int number =queue1.poll();
            queue2.add(number);
        }
        Queue temp=queue1;
        queue1=queue2;
        queue2=temp;

    }
    public int pop(){
        if (!queue1.isEmpty()) {
            return queue1.poll();
        }
        return -1;
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue=new StackUsingQueue();
        stackUsingQueue.push(1);
        stackUsingQueue.push(2);
        stackUsingQueue.push(3);
        stackUsingQueue.push(4);
        stackUsingQueue.push(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(stackUsingQueue.pop());
        }
    }
}
