import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapContainesAnotherMap {
    public static void main(String[] args) {
        HashMap<String, Long> resultMap=new HashMap<String, Long>();
        HashMap<String, List<Object>> map1=new HashMap<String, List<Object>>();

        map1.put("a", Arrays.asList("1","2"));
        map1.put("b", Arrays.asList("3","4"));

        HashMap<String, List<Object>> map2=new HashMap<String, List<Object>>();
        map2.put("a", Arrays.asList("5","6"));
        map2.put("b", Arrays.asList("7","8"));
        map2.put("c", Arrays.asList("3","4"));

        System.out.println(map1.keySet().containsAll(map2.keySet()));

        if (map2.keySet().containsAll(map1.keySet())){
            int i=0;
            for (Map.Entry<String,List<Object>> s1: map2.entrySet()) {

            }
        }
    }
}
