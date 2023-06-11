import java.util.HashMap;

public class StringComaprisonForBoolean {
    public static void main(String[] args) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("tracked","false");


        System.out.println(map.get("tracked").equals("false"));
        map.put("tracked","true");
        System.out.println(map.get("tracked").equals("false"));
    }
}
