import java.util.ArrayList;
import java.util.List;

public class Java5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        getReversed(list);
        System.out.println(list);

    }
    private static List getReversed(ArrayList<Integer> list) {
        int l1= list.remove(0);
        if (list.isEmpty()){
            list.add(l1);
            return list;
        }
        getReversed(list);
        list.add(l1);
        return list;
    }
}
