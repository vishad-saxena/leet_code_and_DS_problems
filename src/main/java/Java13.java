
//validate wether string is having a validf integer or not
public class Java13 {

    public static void main(String[] args) {
        String str="123";
        str.chars().filter(e -> new Integer(e) instanceof Integer ? true : false) ;
    }

}
