public class ArrayEmptyCheck {
    public static void main(String[] args) {
        String str="PUSH, , , PUSH, , EMAIL, PUSH";
        str = str.replaceAll("\\s+", "");
        String[] str2=str.split(",");
//        System.out.println(str.toString());
        for (int i = 0; i < str2.length; i++) {
            if (str2[i].isEmpty()){
                System.out.println(str2[i]);
                break;
            }
            else {
                System.out.println(str2[i]);
            }
        }
    }
}
