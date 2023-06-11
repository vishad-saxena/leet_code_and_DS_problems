package leetcode;

public class CandiesDistributionAmongChildren {
    public static void main(String[] args) {
        for (int i:getArrayOfCandiesAmongChildren(20,4)) {
            System.out.println(i);
        }
    }

    private static int[] getArrayOfCandiesAmongChildren(int candies,int kids) {
        int i=0;
        int candy=1;
        int[] arr=new int[kids];
        while(candy<=candies){
            if (i==kids)i=0;
            arr[i]+=candy;
            candies-=candy;
            candy++;
            i++;
        }
        if (candies>0){
            if (i==kids)i=0;
            arr[i]+=candies;
        }
        return arr;
    }
}
