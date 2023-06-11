package leetcode;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbersInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println(getResultLinkedListOfAdditionOfTwoLists(l1,l2));
    }

    private static LinkedList getResultLinkedListOfAdditionOfTwoLists(List<Integer> l1,List<Integer> l2) {
        LinkedList<Integer> res=new LinkedList<>();
        int carry=0;
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i)+l2.get(i)+carry>=10){
                int num= (l1.get(i)+l2.get(i)+carry)%10;
                res.add(i,num);
                carry=(l1.get(i)+l2.get(i)+carry)/10;
            }else {
                res.add(i,l1.get(i)+l2.get(i)+carry);
            }
        }
        return res;
    }
}
