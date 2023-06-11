import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class FIndFileSize {
    public static void main(String[] args) {

        String fileName = "C:/Users/vishad.saxena/Downloads/abc.txt";
        printFileSize(fileName);
    }

    public static void printFileSize(String fileName) {

        File file=new File(fileName) ;

        if (Long.valueOf(file.length()).floatValue()<30000000 && Long.valueOf(file.length()).floatValue()!=0) {

            // size of a file (in bytes)
            float bytes = file.length();
           final ArrayList l=new ArrayList();
            final HashSet hs=new HashSet();

            LinkedList<AddingValuesToArray> ll=new LinkedList();
            ll.add(new AddingValuesToArray());
            System.out.println(ll);
            hs.add("abc");
            System.out.println(hs);







            System.out.println(bytes);
        }
        else System.out.println("file not exists");
    }
}
