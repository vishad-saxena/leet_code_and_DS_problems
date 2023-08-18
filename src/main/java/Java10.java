import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java10 {
    public static void main(String[] args) {
        String number="madam";
        String test= "adabcd";
        Map<Character,Long> map=test.chars()
                .mapToObj(i->Character.toLowerCase((char)i))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

        System.out.println(isPalindrome(number));


    }

    private static boolean isPalindrome(String number) {
        int left=0;
        int right= number.length()-1;
        while (left<right){
            if (number.charAt(left)!= number.charAt(right)){
                System.out.println("not palindrome");
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
