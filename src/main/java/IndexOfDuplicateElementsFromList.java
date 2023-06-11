import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexOfDuplicateElementsFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("EMAIL","PUSH","SMS","EMAIL");
        final Map<String, List<Integer>> indexMap = IntStream.range(0, list.size()).boxed()
                .collect(Collectors.groupingBy(list::get));
        System.out.println(indexMap);
    }
}
