import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigDecimalPoc {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(6,3,5,5,6,4,4,6,7,8,90,8,56,56,45,45,6,3,5,5,6,4,4,6,7,8,90,8,56,56,45,45
                ,6,3,5,5,6,4,4,6,7,8,90,8,56,56,45,45,6,3,5,5,6,4,4,6,7,8,90,8,56,56,45,45);
        Long size= Long.valueOf(l1.size());
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Long n=5l;
        System.out.println("**"+size);
        if (size<5 && size!=0){
            list.add(l1.subList(0, Math.toIntExact(size)));
        }
         else if(size%5==0 && size>=5) {
            Long count = size / 5;
            List<Integer> t0 = l1.subList(0, Math.toIntExact(n));
            list.add(t0);
            for (int i = 1; i < count; i++) {
                List<Integer> ti = l1.subList(Math.toIntExact(n), (int) (n + 5));
                n = n + 5;
                list.add(ti);
            }
        }
        else {
            Long count =size/5;
            List<Integer> t0=l1.subList(0, Math.toIntExact(n));
            list.add(t0);
            for (int i = 1; i < count; i++) {
                List<Integer> ti=l1.subList(Math.toIntExact(n), (int) (n+5));
                n=n+5;
                list.add(ti);
            }
            list.add(l1.subList(Math.toIntExact(n), Math.toIntExact((n + (size - n)))));

        }
        System.out.println(n);
        for (List<Integer> l:list) {
            System.out.println(l);
        }
    }
}
