import java.util.ArrayList;
import java.util.List;

public class ListToString {
    String groupBy;

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public static void main(String[] args) {
        List<String> grpb=new ArrayList<>();
        grpb.add("abc");
        grpb.add("def");
        ListToString lts=new ListToString();

        lts.setGroupBy("mnop");
//        lts.setGroupBy(grpb.toString());
        System.out.println(lts.getGroupBy());
    }
}
