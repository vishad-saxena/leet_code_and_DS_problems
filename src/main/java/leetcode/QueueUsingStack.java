package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer>s1=new Stack<Integer>();
    Stack<Integer>s2=new Stack<Integer>();
    public void enque(int x){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public void deque(){
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }

    public static void main(String[] args) {
//        QueueUsingStack q=new QueueUsingStack();
//        q.enque(1);
//        q.enque(2);
//        q.enque(3);
//        q.enque(4);
//        q.deque();
        StackUsingQue stackUsingQue=new StackUsingQue();
        stackUsingQue.push(1);
        stackUsingQue.push(2);
        stackUsingQue.push(3);
        stackUsingQue.push(4);
        stackUsingQue.push(5);
        stackUsingQue.pop();
    }
    static class StackUsingQue{
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        public void push(int x){
            q2.add(x);
            while (!q1.isEmpty()){
                q2.add(q1.poll());
            }
            Queue temp=q1;
            q1=q2;
            q2=temp;
        }
        public void pop(){
            while (!q1.isEmpty()){
                System.out.println(q1.poll());
            }
        }
    }

}
