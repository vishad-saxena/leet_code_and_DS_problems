public class ReverseString {
    public static void main(String[] args) {
        String str="Java is wonderful";

//        Reverse only the words of string
        System.out.println(getRevrsedWords(str));
    }

    private static String getRevrsedWords(String str) {
        String [] strings=str.split(" ");
        StringBuilder builder=new StringBuilder();
        for (int i= strings.length-1;i>=0;i--) {
//         builder.append(strings[i]+" ");

//         2. reverse letters inside words as well
            builder.append(reverseWords(strings[i])+" ");
        }
        return builder.toString();
    }

    private static String reverseWords(String word) {
//        char[] characters=word.toCharArray();
        StringBuilder builder=new StringBuilder();
        int j=word.length()-1;
        while (j>=0){
            builder.append(word.charAt(j));
            j--;
        }
        return builder.toString();
    }
}
