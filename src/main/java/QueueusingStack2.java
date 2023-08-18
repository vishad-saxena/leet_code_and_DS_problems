import leetcode.QueueUsingStack;

import java.util.Stack;

//Implement Queue using 2 stacks
public class QueueusingStack2 {
    Stack<Integer> stack1=new Stack();
    Stack<Integer> stack2=new Stack();
    public void add(int num){
        while(!stack1.isEmpty()){
            int number=stack1.pop();
            stack2.push(number);
        }
        stack1.push(num);
        while (!stack2.isEmpty()){
            int number= stack2.pop();
            stack1.push(number);
        }

    }
    public int poll(){
        if (!stack1.isEmpty()){
            return stack1.pop();
        }
        return -1;
    }

    public static void main(String[] args) {
        QueueusingStack2 q=new QueueusingStack2();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(q.poll());
        }
    }
}
