import org.omg.CORBA.INTERNAL;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddingValuesToArray {
    public static void main(String[] args) {
//        BigInteger[] bi=new BigInteger[]{BigInteger.valueOf(1)};
//        bi[1]= BigInteger.valueOf(5);
//        System.out.println(bi[0]);
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l2.add(2);
        l2.add(2);
        l2.add(2);
        l2.add(2);
        l1.addAll(l2);
        System.out.println(l1);
    }
}
