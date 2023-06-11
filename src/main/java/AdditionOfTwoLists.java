import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdditionOfTwoLists {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        b.add(2);
        b.add(2);
        b.add(2);
        b.add(2);
        b.add(2);
        List<Integer> result=IntStream.range(0, a.size())
                .mapToObj(i -> a.get(i) + b.get(i))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
