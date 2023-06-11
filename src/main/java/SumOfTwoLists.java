import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfTwoLists {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> l2= Arrays.asList(1,2,3,4,5,6);
        List<Integer> l3= IntStream.range(0,l1.size())
                .mapToObj(k-> Integer.sum(l1.get(k), l2.get(k))).collect(Collectors.toList());
        System.out.println(l3);
    }
}
