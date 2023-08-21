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
//        1. find all the duplicate characters in a given string
        str.chars().mapToObj(e->Character.toLowerCase((char)e)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(System.out::println);

//        2. check weather a string is a number or not?
        String str2="123a";
        System.out.println(str2.chars().allMatch(Character::isDigit));
    }

}
