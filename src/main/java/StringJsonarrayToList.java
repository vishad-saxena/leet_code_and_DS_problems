import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class StringJsonarrayToList {
    public static void main(String[] args) {


        String jsonData = "{\n" +
                "  \"delivery\": {\n" +
                "    \"mids\": [\n" +
                "      \"m_BDCOo_YCjwpeeh5zN7KY9nhC97jOag7zURSQEtJMlVXhbNNKestr72Yvv7qXYgRqP4jQIASO_hflKpAVfgqHdw\",\n" +
                "      \"m_eCKXWN61QPGnzoArVLkwgXhC97jOag7zURSQEtJMlVXDLO2x_R4JuRODE8a6q-INO_vtsaNf43GwceNl4SICKA\",\n" +
                "      \"m_JEYxqkVotXTl1ZmI9DHOvHhC97jOag7zURSQEtJMlVWZJmShc2EASdedW4TBSDeKr1aTh_h9U5RruGURnn63Cw\"\n" +
                "    ],\n" +
                "    \"watermark\": 1670998757236\n" +
                "  }\n" +
                "}";

        //Converting jsonData string into JSON object
        JSONObject jsnobject = new JSONObject(jsonData);
        JSONObject jsnobject2 = new JSONObject();
        //Printing JSON object
        System.out.println("JSON Object");
        System.out.println(jsnobject);
        jsnobject2=jsnobject.getJSONObject("delivery");
        //Getting languages JSON array from the JSON object
        JSONArray jsonArray = jsnobject2.getJSONArray("mids");
        //Printing JSON array
        System.out.println("JSON Array");
        System.out.println(jsonArray);

//        HashMap<String,Object> paramMap=new HashMap<String,Object>();
//        paramMap.put("mid",jsonArray.toList());
//        System.out.println(paramMap);
//        List<Object> l=(ArrayList)(paramMap.get("mid"));
        List<Object> l=jsonArray.toList();
        System.out.println(l.size());
        for (Object li:l) {
            System.out.println(li.toString());
        }


//        System.out.println(paramMap.get("mid") instanceof JSONArray);
//        System.out.println(list.size());
//        List<String> list=paramMap.get("mid").

    }
}
