import java.util.concurrent.ConcurrentHashMap;

public class StaticMap {
    static ConcurrentHashMap chm;
    static{
        chm=new ConcurrentHashMap();
        chm.put(1,"123");
        chm.put(2,"231");
        chm.put(3,"312");
    }
    public void getMap(){
        System.out.println(chm);
    }
    public static void main(String[] args) {
//        StaticMap sm=new StaticMap();
//        sm.getMap();

        System.out.println(chm);
        String abc="{\n" +
                "    \"recipient\": {\n" +
                "        \"id\": \"5671247846324045\"\n" +
                "    },\n" +
                "    \"message\": {\n" +
                "        \"attachment\": {\n" +
                "            \"type\": \"template\",\n" +
                "            \"payload\": {\n" +
                "                \"template_type\": \"generic\",\n" +
                "                \"elements\": [\n" +
                "                    {\n" +
                "                        \"title\": \"${title}\",\n" +
                "                        \"image_url\": \"${imageUrl}\",\n" +
                "                        \"subtitle\": \"${subtitle}\",\n" +
                "                        \"default_action\": {\n" +
                "                            \"type\": \"web_url\",\n" +
                "                            \"url\": \"${url}\",\n" +
                "                            \"webview_height_ratio\": \"tall\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }
}
