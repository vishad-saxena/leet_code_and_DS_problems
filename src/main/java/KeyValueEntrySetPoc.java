import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueEntrySetPoc {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
                map.put("abc","1");
                map.put("def","2");
                map.put("ghi","3");
                map.put("jkl","4");
                map.put("mno","5");


        JSONObject body=new JSONObject();
//        JSONObject params=new JSONObject();
        JSONObject toSend=new JSONObject();


//        for (Map.Entry<String,String> entry: map.entrySet()) {
//            params.put(entry.getKey(),entry.getValue());
//        }
        toSend.put("PhoneNumber","917503594397");
        body.put("CampaignID","d26f51d3-dc3c-49ae-9f59-79c95e1cfc47");
        body.put("To",toSend);
        body.put("Parameters",map);

        System.out.println(body);
    }
}
