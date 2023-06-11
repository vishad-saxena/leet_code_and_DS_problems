import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
public class BiMapPoc {
    public static void main(String[] args) {
//        BiMap<String,Integer>myMap=HashBiMap.create();
        BiMap<String,Integer>myMap=HashBiMap.create();
        myMap.put("vishad",null);
        myMap.put("vishesh",1);
        myMap.put("Devarshi",2);
//        System.out.println(myMap.get("vishad"));
        System.out.println(myMap.inverse().get(2));

    }
}
