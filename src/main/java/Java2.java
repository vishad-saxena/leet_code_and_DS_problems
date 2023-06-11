import java.util.ArrayList;
import java.util.function.Predicate;

//reverse a string
public class Java2 {
    public static void main(String[] args) {
        int [] arr={100,80,70,60,110,40,50};
//        int [] arr={100,180,260,310,40,535,695};
        int i =0;
        int j=0;
        int profit=0;
        while(i<arr.length-1){
            j=i+1;
            if (arr[i]<arr[j]){
                profit+=arr[j]-arr[i];
            }
            i++;
        }
        System.out.println(profit);
    }
}


//    final ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(5);
//        list.add(3);
//
//        ArrayList <Integer> list2=new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//
//        boolean bool=list.stream().anyMatch(l->
//            list2.contains(l)
//            );
//        System.out.println(bool);
//    String s="abcdefg";
//    char[] arr=s.toCharArray();
//    int i=0;
//    int j=arr.length-1;
//        while (i!=j){
//                char c=arr[j];
//                arr[j]=arr[i];
//                arr[i]=c;
//                i++;
//                j--;
//
//                }
//                for (char chararcter:arr) {
//                System.out.println(chararcter);
//                }
//                }
