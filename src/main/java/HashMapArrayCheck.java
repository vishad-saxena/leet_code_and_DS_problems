import java.util.HashMap;

public class HashMapArrayCheck {
    public static void main(String[] args) {
        HashMap<String,Integer[]> map=new HashMap<String,Integer[]>();
//        Integer []def={1,2};
        map.put("def",new Integer[]{1,2});
        Integer[] val=map.get("abc");
        if (val==null){
            System.out.println("array null");
        }
        System.out.println(
                (map.get("def"))[1]
                );
    }
}
