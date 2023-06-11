package leetcode;

public class ZigZagConversion {
    public static void main(String[] args) {
        String str="PAYPALISHIRING";
            System.out.println(getString(str,3));
    }

    private static String getString(String s,int k) {
        char[] arr=s.toCharArray();
        int index=0;
        int n=arr.length;
        StringBuilder[] sbs=new StringBuilder[k];
        for (int i = 0; i < k; i++) {
            sbs[i]=new StringBuilder();
        }
        while(index<n){
            for (int i = 0; i < k && index<n; i++) {
                sbs[i].append(arr[index]);
                index++;
            }
            for (int i = k-2; i >0 && index<n; i--) {
                sbs[i].append(arr[index]);
                index++;
            }
        }
        StringBuilder res=sbs[0];
        for (int i = 1; i <k ; i++) {
            res.append(sbs[i].toString());
        }
        return res.toString();
    }
}
