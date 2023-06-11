import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {
    public static void main(String[] args) {
        List<String> l=new CopyOnWriteArrayList<>();
        l.add("a");
        l.add("b");
        Iterator<String> i=l.listIterator();
        while (i.hasNext()){
            String val=i.next();
            System.out.println(val);
            l.add("c");
        }
        System.out.println(l);
    }
}
