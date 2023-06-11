import org.json.JSONArray;
import org.json.JSONObject;

public class ResolvingJsonPayloadToMap {
    public static void main(String[] args) {
        String payload="{\"object\":\"page\",\"entry\":[{\"id\":\"106854485520260\",\"time\":1666008347801,\"messaging\":[{\"sender\":{\"id\":\"5671247846324045\"},\"recipient\":{\"id\":\"106854485520260\"},\"timestamp\":1666008347511,\"postback\":{\"title\":\"Get Started\",\"payload\":\"Hi, GetStarted clicked\",\"mid\":\"m_LKsjcDnzQMKtxHSJYFc7A9InsTb-V9y9QRCyF15AdCNJ0miz-3eSnqT-3LRofYS0LDN_fLaNSZh4za3CYcQeOA\"}}]}]}";
        JSONObject jsonObject=new JSONObject(payload);
        JSONArray jsonArray=jsonObject.getJSONArray("entry");
        String id=jsonArray.getJSONObject(0).getString("id");
        System.out.println(id);

    }
}
