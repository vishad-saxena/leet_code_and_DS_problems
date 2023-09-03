import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Java21 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(-2, 8, -1, 9, 3, -7);

        AtomicInteger product= new AtomicInteger(1);
//        list.stream().filter(e->e>0)


//        Java 8 program to find the average length of strings in a list
//        apple", "banana", "grape", "orange" ,"apricot"

//        Write a Java 8 program to check if all strings in a list start with the letter "A".

//        List<String> list=Arrays.asList( "apple", "banana", "grape", "orange" ,"apricot");
//        List<String> listWithA=list.stream().filter(e->e.startsWith("b")).collect(Collectors.toList());
//        System.out.println(listWithA);

//        list.stream().filter(e->e.charAt(0))
    }
}
