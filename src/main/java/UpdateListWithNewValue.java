import java.util.ArrayList;

public class UpdateListWithNewValue {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add( "Zero" );
        list.add( "One" );
        list.add( "Two" );
        list.add( "Three" );

        for (String l1:list) {
            if (l1.equals("Two")){
                list.set(list.indexOf("Two"),"2" );
            }
        }
        System.out.println(list);
    }
}
