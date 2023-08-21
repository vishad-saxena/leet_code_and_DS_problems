import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//validate wether string is having a validf integer or not
public class Java13 {

    public static void main(String[] args) {
        String str="aaBBccdd";
        Set<Character>set=new HashSet<>();

        str.chars().mapToObj(e->Character.toLowerCase((char)e)).forEach(System.out::println);

//        str.chars().mapToObj(e->Character.toLowerCase((char)e)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e->e.getValue()>1)
//                .forEach(System.out::println);


//        String str="123";
//        System.out.println(str.chars().allMatch(Character::isDigit));
    }

}
