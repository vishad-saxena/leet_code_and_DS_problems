import java.util.ArrayList;
import java.util.HashSet;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o){
        if (this.contains(o)){
            return true;
        }else {
           return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList cal=new CustomArrayList();
        cal.add(1);
        cal.add(1);
        cal.add(1);
        cal.add(2);
        System.out.println(cal);
        HashSet st=new HashSet();
        st.add(new ArrayList<>());
    }
}
