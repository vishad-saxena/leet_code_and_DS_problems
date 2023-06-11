public class StringpartRemovalFromString {
    public static void main(String[] args) {
        String str="abcdef";
        String str1=str.contains("abc_")?str.replace("abc_",""):str;
        System.out.println(str1);
    }
}
