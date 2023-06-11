import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;

public class MapAsString {
    public void logMethod(HashMap map){
        LOG.debug("maps",map);
    }
    private static final Logger LOG = LoggerFactory.getLogger(MapAsString.class);
    public static void main(String[] args) {
        HashMap<String,Integer[]> m=new HashMap();
        m.put("abc",new Integer[]{1,2});
        m.put("def",new Integer[]{3,4});
        System.out.println(m.get("abc")[0]);
//        MapAsString s=new MapAsString();
//        s.logMethod(m);

    }
}
