import java.util.Stack;

public class Java19 {
    Stack<Integer> s1=new Stack();
    Stack<Integer> s2=new Stack<>();

    public void enqueue(int val){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(val);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int dequeu(){
        if (!s1.isEmpty()){
            return s1.pop();
        }
        return -1;
    }
    public void peekQueue(){
        if (!s1.isEmpty()){
            System.out.println(s1.peek());
        }
    }
    public int lastElement(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int last=s2.peek();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return last;
    }

    public static void main(String[] args) {
//        Java19 obj=new Java19();
//        obj.enqueue(1);
//        obj.enqueue(2);
//        obj.enqueue(3);
//        obj.enqueue(4);
//        obj.dequeu();
//        obj.dequeu();
//
//        obj.enqueue(5);
//        obj.dequeu();
//        obj.peekQueue();
//        System.out.println(obj.lastElement());


//        String str="babad";
        String str="dweewf";
        int resLength=0;
        StringBuilder sb=new StringBuilder();
//        if (str.length()==1) System.out.println(1);
//ODD
//        for (int i = 0; i < str.length(); i++) {
//            int left=i;
//            int right=i;
//            int len=0;
//            while(left>0 && right<str.length()){
//                if (str.charAt(left)==str.charAt(right)){
//                    left--;
//                    right++;
//
//                }
//                else {
//                    len=right-left+1;
//                    for (int j = left-1; j <right ; j++) {
//                        sb.append(str.charAt(j));
//                    }
//                    break;
//                }
//            }
//            resLength=Math.max(resLength,len);
//        }
//        even
        for (int i = 0; i < str.length(); i++) {
            int left=i;
            int right=i+1;
            int len=0;
            while(left>0 && right<str.length()){
                if (str.charAt(left)==str.charAt(right)){
                    left--;
                    right++;

                }
                else {
                    len=right-left-1;
                    for (int j = left-1; j <right ; j++) {
                        sb.append(str.charAt(j));
                    }
                    break;
                }
            }
            resLength=Math.max(resLength,len);
        }
        System.out.println(resLength);
        System.out.println(sb.toString());




    }
}


