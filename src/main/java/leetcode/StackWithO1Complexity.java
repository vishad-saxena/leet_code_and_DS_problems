package leetcode;

import java.util.Stack;

public class StackWithO1Complexity {
    Stack<Integer> s;
    Integer minEle;
    public StackWithO1Complexity(Stack<Integer> s){
        this.s=s;
    }
    public void getMinEle(){
        if (s.empty()) System.out.println("stack is empty");
        else System.out.println(minEle);
    }
    public void peek(){
        if (s.empty()) System.out.println("stack is empty");
        else {
            Integer t=s.peek();
            if (t<minEle){
                System.out.println("TOP element is: "+(minEle));
            }else System.out.println("TOP element is: "+t);
        }
    }
    public void pop(){
        if (s.empty()) System.out.println("stack is empty");
        else {
            Integer t=s.pop();
            if(t<minEle) {
                System.out.println("popped element is: "+ (minEle));
                minEle=2*minEle-t;
            }
            else System.out.println("popped element is: "+t);
        }
    }
    public void push(Integer x){
        if (s.empty()){
            s.push(x);
            minEle=x;
        }
        else {
            if (x<minEle){
                s.push(2*x-minEle);
                minEle=x;
            }
            else s.push(x);
        }
    }

    public static void main(String[] args) {
        StackWithO1Complexity s=new StackWithO1Complexity(new Stack<Integer>());
        s.push(3);
        s.push(5);
        s.getMinEle(); //3
        s.push(2);
        s.push(1);
        s.getMinEle();//1
        s.pop();//1
        s.getMinEle();//2
        s.pop();//2
        s.peek();//5
    }
}
