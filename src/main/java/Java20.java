import java.util.List;

// Write a program  , In a given array find which two numbers sum is equal to 14  eg input [ 4, 6 ,10,12, 12,0,14,19,7,6]
public class Java20 {
    public static void main(String[] args) {
        int [] arr={4, 6 ,10,12, 12,0,14,19,7,6};
        int target=14;
        for (int i = 0; i < arr.length; i++) {
            int component=target-arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]==component){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

}
