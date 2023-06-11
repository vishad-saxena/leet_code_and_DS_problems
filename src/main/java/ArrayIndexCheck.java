public class ArrayIndexCheck {
    public static void main(String[] args) {
        String[] str=new String[4];
        str[1]="acd";
        str[2]="acd";
        str[3]="acd";
//        for (String s:str ) {
//            System.out.println(s);
//        }
        String paramString="abc|Cdr|cdff|wwer";
        String[] paramArray = paramString.split("\\|", 5);
//        String[] extendedParamArray=new String[paramArray.length+1];
//        System.arraycopy(paramArray,0,extendedParamArray,0,paramArray.length);
//        extendedParamArray[4]="vishad";
        paramArray[4]="vishad";
        for (String s:paramArray ) {
            System.out.println(s);
        }
    }
}
