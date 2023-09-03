import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//int arr [] = { 2, 0, 54, 0, 23,0, 32 }
//
//output is: 2,54,23,32,0,0,0
public class Java23 {
    public static void main(String[] args) {
        int arr [] = { 2, 0, 54, 0, 23,0, 32 };

        Comparator comparator=(String e1,String e2)->{ return Integer.compare(e1.length(),e2.length())};

        String string="i wan to grow in my organisation";

        Arrays.stream(string.split(" ")).max((e1,e2)->Integer.compare(e1.length(),e2.length())).ifPresent(System.out::println);





//        Arrays.asList(arr).stream().sorted((e1,e2)->
//                {
//                    if (e1<0) {
//                        return -1;
//                    }
//                }
//                )



        int[] resultArr=new int[arr.length];
        int count=0;
        int i=0;
        int j=0;
        while (j < arr.length) {
            i=j;
            while (arr[i] == 0) {
                i++;
                count++;
            }
            resultArr[j]=arr[i];
            j++;
        }
        for (int k = 0; k < count; k++) {
            resultArr[k]=0;
        }

        for (int k = 0; k < resultArr.length; k++) {
            System.out.println(resultArr[k]);
        }
    }
}
