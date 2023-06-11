import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectsToStringListConversion {
    public static void main(String[] args) {
        List<Object> l1=new ArrayList<Object>();
        l1.add(1);
        l1.add(1);
        l1.add(4);
        l1.add(8);
        System.out.println(l1);

        List<String> l2=new ArrayList<String>();
        l2.add(String.valueOf(l1));
        System.out.println(l2);
        List<Integer> integerList = l1.stream()
                .map(object -> (Integer)object)
                .collect(Collectors.toList());
        System.out.println(integerList);

    }
}
